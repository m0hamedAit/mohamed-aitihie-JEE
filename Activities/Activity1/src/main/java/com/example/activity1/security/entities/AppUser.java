package com.example.activity1.security.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class AppUser {
    @Id
    private String userId;
    @Column(unique=true)
    private String username;
    private String password;
    private boolean active;
    @ManyToMany(fetch= FetchType.EAGER)
    private List<AppRole> userRoles = new ArrayList<>();
}

