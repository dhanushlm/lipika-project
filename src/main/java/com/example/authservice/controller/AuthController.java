package com.example.authservice.controller;

import com.example.authservice.model.User;
import com.example.authservice.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        boolean isAuthenticated = authService.authenticate(user);
        if (isAuthenticated) {
            return "Login successful!";
        } else {
            return "Invalid credentials.";
        }
    }
}

