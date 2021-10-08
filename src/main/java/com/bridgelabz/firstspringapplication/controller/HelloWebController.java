package com.bridgelabz.firstspringapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebController {

    @GetMapping("/")
    public String getMessage() {
        return "First Spring Application";
    }

    @GetMapping("/first")
    public String getWelcomeMessage() {
        return "Welcome to First Spring Application";
    }
}
