package com.example.chat_app.controller;


import com.example.chat_app.model.User;
import com.example.chat_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * Test controller for verifying User entity and database connection.
 */
@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private UserRepository userRepository;

    // Endpoint to create a test user
    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        // Saves the user to the database
        return userRepository.save(user);
    }

    // Endpoint to retrieve all users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        // Fetches all users from the database
        return userRepository.findAll();
    }
}

