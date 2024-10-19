package main.java.com.yourpackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AggregationController {

    @Autowired
    private WeatherAggregationService aggregationService;

    @GetMapping("/average-temperature")
    public double getAverageTemperature(@RequestParam String city) {
        return aggregationService.getAverageTemperature(city);
    }

    // Endpoints for other aggregates
}
