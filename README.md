# Real-Time Data Processing System for Weather Monitoring

## Description
A real-time data processing system to monitor weather conditions and provide summarized insights using rollups and aggregates.

## Setup

### Backend
1. Clone the repository
2. Navigate to the `backend` directory
3. Run `mvn clean install` to install dependencies
4. Run `mvn spring-boot:run` to start the backend server

### Frontend
1. Navigate to the `frontend` directory
2. Run `npm install` to install frontend dependencies
3. Run `npm start` to start the frontend server

## Configuration
1. Replace `YOUR_API_KEY` in `application.properties` with your OpenWeatherMap API key.
2. Update PostgreSQL database configuration in `application.properties`.

## API Endpoints
- GET `/weather?city={city}`
  - Retrieves current weather data for the specified city.
  
- GET `/average-temperature?city={city}`
  - Retrieves the average temperature for the specified city.

## Example Request
- GET `/weather?city=London`
- GET `/average-temperature?city=London`
