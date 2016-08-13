package com.achen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {


    @RequestMapping("/resource/{id}")
    public String getResource() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/resource/{id}")
    public void createResource(String id, InputData inputData) {
    }
}
