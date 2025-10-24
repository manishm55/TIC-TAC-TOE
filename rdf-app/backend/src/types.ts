export interface Station {
  station_id: number;
  name: string;
  apikey: string;
  latitude: number;
  longitude: number;
  freq: number;
  antenna_type: 'UCA' | 'ULA' | 'Custom';
  active: boolean;
  group_id: number;
}

export interface BearingData {
  timestamp: number;
  station_id: number;
  latitude: number;
  longitude: number;
  radioBearing: number; // 0-360 degrees
  confidence: number; // 0-10 scale
  power: number; // dBm
  frequency: number; // Hz
  doaArray: number[]; // 360 values representing DOA spectrum
}

export interface TriangulationResult {
  estimatedLocation: { latitude: number; longitude: number };
  confidence: number;
  stationsUsed: number[];
  heatmapTiles: Array<{ latitude: number; longitude: number; power: number }>;
}
