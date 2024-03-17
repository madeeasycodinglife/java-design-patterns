package com.madeeasy;

// Client code
public class Main {
    public static void main(String[] args) {
        // Get service locator instance
        ServiceLocator serviceLocator = new ServiceLocator();

        // Retrieve email service
        MessagingService emailService = serviceLocator.getService("email");
        emailService.sendMessage("Hello, this is an email message.");

        // Retrieve SMS service
        MessagingService smsService = serviceLocator.getService("sms");
        smsService.sendMessage("Hello, this is an SMS message.");
    }
}