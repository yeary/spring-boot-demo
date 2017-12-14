package com.demo.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableEurekaClient
public class ProviderApplication {

    @RequestMapping("/")
    public String greeting() {
        return "hello~~";
    }

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}