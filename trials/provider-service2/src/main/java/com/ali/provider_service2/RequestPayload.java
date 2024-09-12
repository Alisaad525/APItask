package com.ali.provider_service2;

public class RequestPayload {
    private Long phoneNumber;
    private String message;
    private String language;

    // Default constructor
    public RequestPayload() {
    }

    // Parameterized constructor
    public RequestPayload(Long phoneNumber, String message, String language) {
        this.phoneNumber = phoneNumber;
        this.message = message;
        this.language = language;
    }

    // Getters
    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    public String getLanguage() {
        return language;
    }

    // Setters
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
