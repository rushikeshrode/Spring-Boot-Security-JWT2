package com.rush.jwt2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/")
    public String healthCheck(){
        return "Application status : OK";
    }
}
