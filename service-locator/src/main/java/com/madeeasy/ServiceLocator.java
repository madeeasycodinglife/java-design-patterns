package com.madeeasy;

import com.madeeasy.impl.EmailService;
import com.madeeasy.impl.SMSService;

// Service Locator
public class ServiceLocator {
    private static final EmailService emailService = new EmailService();
    private static final SMSService smsService = new SMSService();

    public MessagingService getService(String serviceType) {
        if (serviceType.equalsIgnoreCase("email")) {
            System.out.println("Email service requested");
            return emailService;
        } else if (serviceType.equalsIgnoreCase("sms")) {
            System.out.println("SMS service requested");
            return smsService;
        } else {
            System.out.println("Invalid service type");
            return null;
        }
    }
}

