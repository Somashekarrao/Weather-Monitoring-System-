package main.java.com.yourpackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Service
public class WeatherAggregationService {

    @PersistenceContext
    private EntityManager entityManager;

    public double getAverageTemperature(String city) {
        String queryStr = "SELECT AVG(w.temperature) FROM WeatherData w WHERE w.city = :city";
        Query query = entityManager.createQuery(queryStr);
        query.setParameter("city", city);
        return (double) query.getSingleResult();
    }

    // Similar methods for other aggregates like humidity, pressure, etc.
}
