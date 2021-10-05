package com.example.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.bootstrap")
public class BooTstrapApplication {
    public static void main(String[] args) {
        SpringApplication.run(BooTstrapApplication.class, args);
    }
}
