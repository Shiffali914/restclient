package io.pragra.learning.restclientapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class App1Config {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
