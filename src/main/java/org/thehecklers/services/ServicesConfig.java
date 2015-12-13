package org.thehecklers.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by markheckler on 12/13/15.
 */
@Configuration
public class ServicesConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
