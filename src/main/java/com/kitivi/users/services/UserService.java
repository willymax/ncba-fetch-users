package com.kitivi.users.services;

import com.kitivi.users.dto.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * This class represents a service for managing users in the system
 *
 * @author : KENCONT2325
 * @created : 6/21/2024, Friday
 **/
@Component
public class UserService {
    public List<User> getAllUsers() {
        // create and return a list of dummy users
        return List.of(
                new User(
                        "William Makau",
                        "william.k.makau@gmail.com",
                        "admin"
                ),
                new User(
                        "Joash Sasita",
                        "john@gmail.com",
                        "user"
                )
        );
    }
}
