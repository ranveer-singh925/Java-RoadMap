package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class controller {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hi welcome! Ranveer";
    }
}
