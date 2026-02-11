package com.dev.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dev.first_spring_app.domain.User;
import com.dev.first_spring_app.service.HelloWorldService;

@RestController
@RequestMapping("/hello")
public class HelloWordController {
    
    @Autowired
    private HelloWorldService helloWorldService;


    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Alexandre");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable(" id") String id, @RequestParam(value = "filter", defaultValue = "default") String filter, @RequestBody User body) {
        return "Hello World: " + filter;
    }

}
