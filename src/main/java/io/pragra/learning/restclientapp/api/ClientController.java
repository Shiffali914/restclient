package io.pragra.learning.restclientapp.api;

import io.pragra.learning.restclientapp.dto.Gituser;
import io.pragra.learning.restclientapp.service.GitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private GitService gitservice;

//    @GetMapping()
//    public Gituser client() {
//        //String response = restTemplate.getForObject("https://api.github.com/users/atinsingh", String.class);
//        Gituser responseEntity = restTemplate.getForObject("https://api.github.com/users/atinsingh", Gituser.class);
//        System.out.println(responseEntity);
//        return responseEntity;
//        // call student service, get response, print response, return response
//        //resttemplate spring gives us default
//    }

    @GetMapping("/getuser")
    public Gituser getUser(@RequestParam String username) {
        return gitservice.getGituser(username);
    }

    @PostMapping("/add")
    public Gituser add(@RequestBody Gituser gituser) {
        return gitservice.addgituser(gituser);
    }

    @PostMapping("/adduser")
    public Gituser addUser(@RequestParam Integer id, @RequestParam String username) {
        return gitservice.checkandsave(id,username);
    }


}
