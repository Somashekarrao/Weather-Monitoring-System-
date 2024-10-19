import React, { useState } from 'react';

function App() {
    const [city, setCity] = useState('');
    const [weather, setWeather] = useState(null);

    const fetchWeather = async () => {
        const response = await fetch(`/weather?city=${city}`);
        const data = await response.json();
        setWeather(data);
    };

    return (
        <div>
            <h1>Weather Monitoring</h1>
            <input 
                type="text"
                placeholder="Enter city"
                value={city}
                onChange={(e) => setCity(e.target.value)}
            />
            <button onClick={fetchWeather}>Get Weather</button>
            {weather && (
                <div>
                    <p>City: {weather.name}</p>
                    <p>Temperature: {weather.main.temp}</p>
                    <p>Humidity: {weather.main.humidity}</p>
                    <p>Pressure: {weather.main.pressure}</p>
                </div>
            )}
        </div>
    );
}

export default App;
