package io.pragra.learning.restclientapp.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Gituser {

    @Id
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Gituser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Gituser gituser = (Gituser) o;
        return Objects.equals(id, gituser.id) && Objects.equals(name, gituser.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}