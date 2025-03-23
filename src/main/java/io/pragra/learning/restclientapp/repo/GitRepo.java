package io.pragra.learning.restclientapp.repo;

import io.pragra.learning.restclientapp.dto.Gituser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GitRepo extends JpaRepository<Gituser, Integer> {
}
