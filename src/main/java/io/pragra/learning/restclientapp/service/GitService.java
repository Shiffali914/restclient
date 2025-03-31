package io.pragra.learning.restclientapp.service;

import io.pragra.learning.restclientapp.dto.Gituser;
import io.pragra.learning.restclientapp.repo.GitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class GitService {

    @Autowired
    GitRepo gitRepo;

    @Autowired
    RestTemplate restTemplate;

    public Gituser getgituserFromDB(Integer id) {
        return gitRepo.findById(id).orElse(null);
    }
    public Gituser addgituser(Gituser gituser) {
        System.out.println(gituser.toString());
        return gitRepo.save(gituser);
    }

    public Gituser checkandsave(Integer id, String name) {
        Gituser gituser = getgituserFromDB(id);
        if (gituser == null) {
            gituser=getGituser(name);
            if(gituser!=null)
                return addgituser(gituser);
        }
        return gituser;
    }

    public Gituser getGituser(String name) {
        Gituser gituser = restTemplate.getForObject("https://api.github.com/users/" + name, Gituser.class);
        System.out.println(gituser);
        return gituser;
    }

}

