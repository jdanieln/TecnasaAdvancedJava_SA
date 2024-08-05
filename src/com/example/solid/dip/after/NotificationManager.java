package com.example.solid.dip.after;

public class NotificationManager {
    private NotificationService emailService;
    private NotificationService smsService;

    public NotificationManager(NotificationService emailService, NotificationService smsService) {
        this.emailService = emailService;
        this.smsService = smsService;
    }

    public void sendEmailNotification(String recipient, String message) {
        emailService.send(recipient, message);
    }

    public void sendSMSNotification(String recipient, String message) {
        smsService.send(recipient, message);
    }
}
