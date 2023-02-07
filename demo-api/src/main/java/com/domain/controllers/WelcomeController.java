package com.domain.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome") // an endpoint that can be accessed from client, example: "http://localhost:8080/api/welcome"
public class WelcomeController {
    
    @GetMapping //@GetMapping("welcomez") // you can access this function with method GET 
    public String welcome() {
        return "Welcome to Spring Boot Rest API";
    }

    // @PostMapping // you can access this function with method POST 
    // public String other() {
    //     return "Data lain";
    // }

    @GetMapping("joe")
    public String joe() {
        return "Joe Wilson";
    }

}
