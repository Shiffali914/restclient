package io.pragra.learning.restclientapp.api;

import io.pragra.learning.restclientapp.dto.Gituser;
import io.pragra.learning.restclientapp.feignclients.GitClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
@RequestMapping("/webclient")
public class WebController {

    @Autowired
    private WebClient webClient;

    @Autowired
    GitClient gitClient;

//    @GetMapping("/getclient")
//    public Gituser webClient(@RequestParam String username) {
//        Gituser gituserMono = webClient
//                .get().uri("https://api.github.com/users/" + username)
//                .header("username", "shiffali123")
//                .header("Password", "sh645t4t45")
//                .retrieve()
//                .bodyToMono(Gituser.class).timeout(Duration.ofMillis(10000)).block();
//
//        System.out.println(gituserMono);
//        return gituserMono;
//    }
        @GetMapping("/get")
        public Gituser Client(@RequestParam String username) {

            Gituser responseEnitity = gitClient.retrieveGitDetails(username);
            return responseEnitity;

        }
}
