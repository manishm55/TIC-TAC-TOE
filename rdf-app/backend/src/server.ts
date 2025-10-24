import express from 'express';
import http from 'http';
import cors from 'cors';
import { Server as IOServer } from 'socket.io';
import { DataSimulator } from './simulator.js';
import { TriangulationEngine } from './triangulation.js';
import { Station, BearingData, TriangulationResult } from './types.js';

const app = express();
app.use(cors());
app.use(express.json());

const server = http.createServer(app);
const io = new IOServer(server, {
  cors: { origin: '*'}
});

const stations: Station[] = [
  {
    station_id: 3826, name: 'kraken_one', apikey: 'c7301b17829fd3d6',
    latitude: 50.73698963565033, longitude: 7.009624403772563,
    freq: 433420000, antenna_type: 'UCA', active: true, group_id: 1531
  },
  {
    station_id: 3827, name: 'kraken_two', apikey: '6c72753aaae0141b',
    latitude: 50.75053003467639, longitude: 7.130660264638948,
    freq: 433420000, antenna_type: 'UCA', active: true, group_id: 1531
  }
];

const simulator = new DataSimulator();
const engine = new TriangulationEngine();

app.get('/api/stations', (_req, res) => {
  res.json(stations);
});

app.post('/api/compute', (req, res) => {
  const bearings: BearingData[] = req.body?.bearings ?? [];
  try {
    const result: TriangulationResult = engine.compute(bearings);
    res.json(result);
  } catch (e) {
    res.status(500).json({ error: 'Computation error' });
  }
});

io.on('connection', (socket) => {
  socket.emit('stations', stations);

  socket.on('changeFrequency', ({ station_id, freq }: { station_id: number; freq: number; }) => {
    const s = stations.find(st => st.station_id === station_id);
    if (s) {
      s.freq = freq;
    }
  });
});

const PORT = 3001;
server.listen(PORT, () => {
  console.log(`Backend listening on http://localhost:${PORT}`);
});

// periodic updates
setInterval(() => {
  try {
    const bearings = simulator.generate(stations);
    const result = engine.compute(bearings);
    io.emit('bearingUpdate', { bearings, result });
  } catch (e) {
    // swallow to keep loop alive
  }
}, 2000);
