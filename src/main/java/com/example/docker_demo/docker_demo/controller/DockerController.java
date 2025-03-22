package com.example.docker_demo.docker_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @GetMapping("/getDocker")
    public String getMessage(String msg) {
        return "Hello Docker";
    }
}
