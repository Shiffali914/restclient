package io.pragra.learning.restclientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestClientAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestClientAppApplication.class, args);
    }


}
