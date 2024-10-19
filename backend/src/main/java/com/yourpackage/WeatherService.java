package main.java.com.yourpackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    private WeatherDataRepository repository;

    public void saveWeatherData(String city, double temperature, double humidity, double pressure) {
        WeatherData data = new WeatherData();
        data.setCity(city);
        data.setTemperature(temperature);
        data.setHumidity(humidity);
        data.setPressure(pressure);
        repository.save(data);
    }
}
