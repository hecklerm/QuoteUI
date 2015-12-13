package org.thehecklers.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.thehecklers.entities.Quote;
import org.thehecklers.entities.QuoteSource;

/**
 * Created by markheckler on 12/13/15.
 */
@Service
@ConfigurationProperties(prefix="quote")
@Component
public class QuoteService {
    private String service;

    @Autowired
    private RestTemplate restTemplate;

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @HystrixCommand(fallbackMethod = "defaultQuote")
    public Quote randomQuote() {
        return restTemplate.getForObject(service, Quote.class);
    }

    public Quote defaultQuote() {
        return new Quote("No matter where you go, there you are.", "", new QuoteSource("Yogi Berra", "New York Yankee and baseball legend"));
    }
}
