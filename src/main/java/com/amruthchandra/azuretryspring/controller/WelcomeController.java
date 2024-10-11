package com.amruthchandra.azuretryspring.controller;

import com.amruthchandra.azuretryspring.bo.GreetingResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/hello")
    public ResponseEntity<GreetingResponse> getHello() {
        GreetingResponse response = new GreetingResponse();
        response.setMessage("Hello World, I am the beginning");
        return ResponseEntity.ok().body(response);
    }

}
