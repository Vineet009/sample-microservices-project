package com.example.microservice1.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreeting() {
        return "Hello from Microservice 1!";
    }
}
