package com.example.model;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity  extends BaseEntity {
    private String username;
    private String password;


    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> role = new HashSet<>();

    public UserEntity(String username, String password, Set<String> role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public UserEntity() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRole() {
        return role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }
}

