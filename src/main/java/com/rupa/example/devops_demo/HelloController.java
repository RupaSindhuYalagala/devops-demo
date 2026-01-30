package com.rupa.example.devops_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from the new DevOps pipeline - rupa sindhu. have a nice day. i just wanted to say that we have to be happy and succefull. keep similing.!";
    }
}