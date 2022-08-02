package com.example.test.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testcontroller {
    @RequestMapping("/test")
    public String hello(){
        return "Test!!!!";
    }

}
