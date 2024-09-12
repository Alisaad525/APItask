package com.ali.provider_service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProviderService2Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderService2Application.class, args);
    }

    @PostMapping("/POSTprovider2")
    public String postProvider2(@RequestBody RequestPayload requestPayload) {
        System.out.println("POST working");
        return "POST working with phoneNumber " + requestPayload.getPhoneNumber()
                + ", message " + requestPayload.getMessage()
                + " and language " + requestPayload.getLanguage();
    }
}

