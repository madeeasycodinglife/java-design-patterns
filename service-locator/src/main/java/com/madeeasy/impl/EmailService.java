package com.madeeasy.impl;


import com.madeeasy.MessagingService;

// Concrete service: EmailService
public class EmailService implements MessagingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}
