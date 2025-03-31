package io.pragra.learning.restclientapp.feignclients;

import io.pragra.learning.restclientapp.dto.Gituser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="gitclient", url="https://api.github.com")
public interface GitClient {

    @GetMapping("/users/{username}")
    Gituser retrieveGitDetails(@PathVariable("username") String username);

}
