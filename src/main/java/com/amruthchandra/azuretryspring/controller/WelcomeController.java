package com.amruthchandra.azuretryspring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/hello")
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok().body("Hello World, I am the beginning");
    }

}
