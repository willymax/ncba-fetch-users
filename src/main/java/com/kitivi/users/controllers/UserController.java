package com.kitivi.users.controllers;

import com.kitivi.users.dto.User;
import com.kitivi.users.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This class represents a controller with endpoints for managing users
 *
 * @author : william makau
 * @created : 6/21/2024, Friday
 **/
@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    // an endpoint to return list of all users
    @GetMapping(value = {"/", ""}, produces = "application/json")
    public ResponseEntity<List<User>> getAllUsers() {
        // fetch a list of users
        List<User> allUsers = userService.getAllUsers();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }
}
