package com.example.microservice2.service;

import com.example.microservice2.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User createUser(User user) {
        // Simulate user creation
        user.setId(1L);
        return user;
    }
}
