package com.kitivi.users.dto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author : william makau
 * @created : 6/21/2024, Friday
 **/
class UserTest {
    // User class unit test
    private User user;

    @BeforeEach
    void setUp() {
        user = new User(
                "William Makau",
                "william.k.makau@gmail.com",
                "admin"
        );
    }

    @Test
    void getName() {
        assertEquals("William Makau", user.getName());
    }

    @Test
    void getEmail() {
        assertEquals("william.k.makau@gmail.com", user.getEmail());
    }

    @Test
    void getRole() {
        assertEquals("admin", user.getRole());
    }
}