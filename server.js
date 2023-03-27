const express = require('express');
const bodyParser = require('body-parser');
const mongoose = require('mongoose');

const app = express();
const PORT = process.env.PORT || 3000;

// Middleware
app.use(bodyParser.json());

// Connect to database
mongoose.connect('mongodb://localhost/myDatabase');

// Define routes
app.get('/', (req, res) => {
  res.send('Hello World1243!');
});

// Start server
app.listen(PORT, () => {
  console.log(`Server running on port ${PORT}`);
});
