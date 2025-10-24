import * as turf from '@turf/turf';
import { BearingData, TriangulationResult } from './types.js';

function degToRad(d: number): number { return (d * Math.PI) / 180; }
function radToDeg(r: number): number { return (r * 180) / Math.PI; }
function normalizeAngle(angle: number): number {
  let a = angle % 360;
  if (a < 0) a += 360;
  return a;
}

export class TriangulationEngine {
  private lineLengthKm = 100; // Long lines for intersections

  compute(bearings: BearingData[]): TriangulationResult {
    if (!bearings || bearings.length < 2) {
      return {
        estimatedLocation: { latitude: 0, longitude: 0 },
        confidence: 0,
        stationsUsed: [],
        heatmapTiles: [],
      };
    }

    const features: Array<ReturnType<typeof turf.lineString>> = [];
    const weights: number[] = [];

    for (const b of bearings) {
      const start: [number, number] = [b.longitude, b.latitude];
      const endPoint = turf.destination(start, this.lineLengthKm, b.radioBearing, { units: 'kilometers' });
      const line = turf.lineString([start, endPoint.geometry.coordinates]);
      features.push(line);
      const w = Math.max(0.001, (b.confidence + 0.1) * (Math.max(-150, Math.min(-30, b.power)) + 160));
      weights.push(w);
    }

    const intersections: Array<[number, number]> = [];
    for (let i = 0; i < features.length; i++) {
      for (let j = i + 1; j < features.length; j++) {
        const li = features[i];
        const lj = features[j];
        const is = turf.lineIntersect(li, lj);
        if (is.features.length > 0) {
          for (const f of is.features) {
            if (f.geometry && f.geometry.type === 'Point') {
              intersections.push((f.geometry.coordinates as [number, number]));
            }
          }
        }
      }
    }

    let estimate: turf.Coord | null = null;
    if (intersections.length > 0) {
      // Weighted centroid of intersection points. Weights by pair weights.
      let sumW = 0;
      let sumLon = 0;
      let sumLat = 0;
      for (const p of intersections) {
        // approximate weight: average of all weights
        const w = weights.reduce((a, c) => a + c, 0) / weights.length;
        sumW += w;
        sumLon += p[0] * w;
        sumLat += p[1] * w;
      }
      estimate = [sumLon / sumW, sumLat / sumW];
    } else {
      // Fallback: use weighted least squares from bearings
      const A: number[][] = [];
      const bvec: number[] = [];
      for (const bd of bearings) {
        const theta = degToRad(normalizeAngle(bd.radioBearing));
        const nx = Math.sin(theta);
        const ny = Math.cos(theta);
        // Line normal dot (x - x0, y - y0) = 0 -> nx*x + ny*y = c
        const c = nx * bd.longitude + ny * bd.latitude;
        const w = Math.max(1e-3, bd.confidence + 0.1);
        A.push([Math.sqrt(w) * nx, Math.sqrt(w) * ny]);
        bvec.push(Math.sqrt(w) * c);
      }
      // Solve least squares A*[x;y] ≈ b via normal equations
      const AT = (M: number[][]): number[][] => M[0].map((_, i) => M.map(row => row[i]));
      const matMul = (M: number[][], N: number[][]): number[][] => M.map(row => N[0].map((_, j) => row.reduce((s, v, k) => s + v * N[k][j], 0)));
      const matVec = (M: number[][], v: number[]): number[] => M.map(row => row.reduce((s, val, i) => s + val * v[i], 0));
      const inv2 = (M: number[][]): number[][] => {
        const [[a,b],[c,d]] = M;
        const det = a*d - b*c;
        const eps = 1e-9;
        const f = Math.abs(det) < eps ? 1/eps : 1/det;
        return [[ d * f, -b * f], [ -c * f, a * f ]];
      };
      const ATm = AT(A);
      const ATA = matMul(ATm, A);
      const ATb = matVec(ATm, bvec);
      const x = matVec(inv2(ATA), ATb);
      estimate = [x[0], x[1]];
    }

    const estimatedLocation = { latitude: estimate![1], longitude: estimate![0] };

    // Confidence using GDOP-like measure: spread of intersection points relative to estimate
    let confidence = 0;
    if (intersections.length >= 2) {
      const dists = intersections.map(p => turf.distance([estimatedLocation.longitude, estimatedLocation.latitude], p, { units: 'kilometers' }));
      const mean = dists.reduce((a, c) => a + c, 0) / dists.length;
      const variance = dists.reduce((a, c) => a + (c - mean) * (c - mean), 0) / dists.length;
      const gdop = Math.sqrt(variance) + 0.001;
      confidence = Math.max(0, Math.min(10, 10 / (1 + gdop)));
    } else {
      confidence = Math.max(0, Math.min(10, (weights.reduce((a,c)=>a+c,0) / weights.length) / 100));
    }

    // Heatmap generation: grid bounding box around stations and estimate
    const points: Array<[number, number]> = [
      ...bearings.map(b => [b.longitude, b.latitude] as [number, number]),
      [estimatedLocation.longitude, estimatedLocation.latitude] as [number, number],
    ];
    const bbox = turf.bbox(turf.featureCollection(points.map(p => turf.point(p))));
    const expandDeg = 0.2; // enlarge bbox a bit
    const expanded: [number, number, number, number] = [bbox[0]-expandDeg, bbox[1]-expandDeg, bbox[2]+expandDeg, bbox[3]+expandDeg];

    const cellSide = Math.max((expanded[2]-expanded[0]) / 250, (expanded[3]-expanded[1]) / 250);
    const grid = turf.squareGrid(expanded, cellSide, { units: 'degrees' });

    const heatmapTiles: Array<{ latitude: number; longitude: number; power: number }> = [];

    for (const cell of grid.features) {
      if (cell.geometry?.type !== 'Polygon') continue;
      const center = turf.centerOfMass(cell);
      const [lon, lat] = center.geometry.coordinates;
      let score = 0;
      for (const b of bearings) {
        const angle = normalizeAngle(turf.bearing([b.longitude, b.latitude], [lon, lat]));
        const doaIndex = Math.round(angle) % 360;
        const doaVal = b.doaArray[doaIndex] ?? 0;
        const distKm = turf.distance([b.longitude, b.latitude], [lon, lat], { units: 'kilometers' });
        const falloff = 1 / (1 + distKm * distKm * 0.1);
        const weight = Math.max(0.1, b.confidence) * Math.max(0.1, (b.power + 160) / 130);
        score += doaVal * falloff * weight;
      }
      heatmapTiles.push({ latitude: lat, longitude: lon, power: score });
    }

    // Normalize heatmap power 0..1
    let maxP = 0;
    for (const t of heatmapTiles) maxP = Math.max(maxP, t.power);
    if (maxP > 0) {
      for (const t of heatmapTiles) t.power = t.power / maxP;
    }

    return {
      estimatedLocation,
      confidence,
      stationsUsed: bearings.map(b => b.station_id),
      heatmapTiles,
    };
  }
}
