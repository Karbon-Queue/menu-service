package com.karbonqueue.menuservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@GetMapping("/")
    public String getGreeting(){
        return "Welcome Sir";
    }
}
