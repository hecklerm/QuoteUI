package org.thehecklers.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.thehecklers.entities.Quote;
import org.thehecklers.entities.QuoteSource;

/**
 * Created by markheckler on 12/13/15.
 */
@Service
@Component
public class QuoteService {
//    @Value("${quote.service}")
//    private String service;
//    private String service = "http://quote-service/random/";

    @Autowired
    private RestTemplate restTemplate;

//    public String getService() {
//        return service;
//    }
//
//    public void setService(String service) {
//        this.service = service;
//    }

    @HystrixCommand(fallbackMethod = "defaultQuote")
    public Quote randomQuote() {
        return restTemplate.getForObject("http://quote-service/random", Quote.class);
    }

    public Quote defaultQuote() {
        return new Quote("No matter where you go, there you are.", "", new QuoteSource("Yogi Berra", "New York Yankee and baseball legend"));
    }
}
