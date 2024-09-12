package com.ali.mainprovider_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.util.RequestPayload;

@SpringBootApplication
@RestController
public class ProviderServiceApplication {

    private final RestTemplate restTemplate;

    // Constructor injection for RestTemplate
    public ProviderServiceApplication(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProviderServiceApplication.class, args);
    }

    // Bean definition for RestTemplate
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/GETprovider1")
    public String getProvider1(@RequestParam Long phoneNumber, @RequestParam String message) {
        System.out.println("GET working");
        String url = "http://localhost:8081/GETprovider1?phoneNumber=" + phoneNumber + "&message=" + message;
        return restTemplate.getForObject(url, String.class);
    }

    @PostMapping("/POSTprovider2")
    public String postProvider2(@RequestBody RequestPayload requestPayload) {
        System.out.println("POST working");
        String url = "http://localhost:8082/POSTprovider2";
        return restTemplate.postForObject(url, requestPayload, String.class);
    }
}
