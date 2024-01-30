package com.example.demo.demovc.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/greet")
    public String hello(@RequestParam String firstName){
        return "Hello World from Azure GitHub:" + firstName; 
    }
}