import * as turf from '@turf/turf';
function clamp(v, min, max) { return Math.max(min, Math.min(max, v)); }
function gaussian(x, mu, sigma) {
    const d = ((x - mu + 540) % 360) - 180; // shortest circular difference
    return Math.exp(-(d * d) / (2 * sigma * sigma));
}
export class DataSimulator {
    constructor() {
        this.target = { latitude: 50.85, longitude: 7.05 };
        this.transmitPowerDbm = 20; // arbitrary TX power
    }
    generate(stations) {
        const now = Date.now();
        const out = [];
        for (const s of stations) {
            if (!s.active)
                continue;
            const stationPoint = [s.longitude, s.latitude];
            const targetPoint = [this.target.longitude, this.target.latitude];
            const trueBearing = turf.bearing(stationPoint, targetPoint);
            const noise = (Math.random() * 10) - 5; // ±5 degrees
            const measuredBearing = (trueBearing + noise + 360) % 360;
            const distKm = turf.distance(stationPoint, targetPoint, { units: 'kilometers' });
            const distMeters = distKm * 1000;
            const freqHz = s.freq;
            const pathLoss = 20 * Math.log10(distMeters) + 20 * Math.log10(freqHz) - 147.55;
            const shadowing = (Math.random() * 2) - 1; // ±1 dB
            const receivedPower = this.transmitPowerDbm - pathLoss + shadowing;
            const doaArray = new Array(360).fill(0);
            const sigma = 15; // degrees
            for (let ang = 0; ang < 360; ang++) {
                doaArray[ang] = gaussian(ang, (trueBearing + 360) % 360, sigma);
            }
            // normalize array to 0..1
            let max = 0;
            for (const v of doaArray)
                max = Math.max(max, v);
            if (max > 0)
                for (let i = 0; i < 360; i++)
                    doaArray[i] /= max;
            const distanceFactor = clamp(1 / (1 + distKm / 5), 0, 1);
            const powerFactor = clamp((receivedPower + 150) / 80, 0, 1); // map -150..-70 -> 0..1 roughly
            const confidence = clamp(10 * (0.4 * distanceFactor + 0.6 * powerFactor), 0, 10);
            out.push({
                timestamp: now,
                station_id: s.station_id,
                latitude: s.latitude,
                longitude: s.longitude,
                radioBearing: measuredBearing,
                confidence,
                power: receivedPower,
                frequency: s.freq,
                doaArray,
            });
        }
        return out;
    }
}
