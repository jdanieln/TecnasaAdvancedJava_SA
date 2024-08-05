package com.example.solid.principles.dip.after;

public class SMSService implements NotificationService {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}