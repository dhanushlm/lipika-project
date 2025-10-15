package com.example.authservice.service;

import org.springframework.stereotype.Service;
import com.example.authservice.model.User;

@Service
public class AuthService {
    public boolean authenticate(User user) {
        // Simple mock authentication logic
        return "admin".equals(user.getUsername()) && "password".equals(user.getPassword());
    }
}

