package com.example.solid.dip.before;

// Clase de alto nivel que depende directamente de las clases de bajo nivel
public class NotificationManager {
    private EmailService emailService;
    private SMSService smsService;

    public NotificationManager() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    public void sendEmailNotification(String recipient, String message) {
        emailService.sendEmail(recipient, message);
    }

    public void sendSMSNotification(String phoneNumber, String message) {
        smsService.sendSMS(phoneNumber, message);
    }
}