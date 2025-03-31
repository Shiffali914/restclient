package io.pragra.learning.restclientapp.api;

import io.pragra.learning.restclientapp.dto.Gituser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/requestclient")
public class Controllerapi {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/fetchdata")
    public Gituser client(@RequestParam String username) {
        Gituser responseEntity = restTemplate.getForObject("https://api.github.com/users/"+username, Gituser.class);
        System.out.println(responseEntity);
        return responseEntity;

    }
}
