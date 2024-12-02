package com.example.demo55;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class Demo55Application {

    @GetMapping("/greetings")
    public String message() {
        return "Welcome my app";
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo55Application.class, args);

    }

}
