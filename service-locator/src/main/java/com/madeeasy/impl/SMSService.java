package com.madeeasy.impl;


import com.madeeasy.MessagingService;

// Concrete service: SMSService
public class SMSService implements MessagingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
