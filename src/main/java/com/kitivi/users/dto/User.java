package com.kitivi.users.dto;

import lombok.Getter;

/**
 * @author : william makau
 * @created : 6/21/2024, Friday
 * The user class models a user object in the system
 **/
@Getter
public class User {
    private final String name;
    private final String email;
    private final String role;

    public User(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }
}
