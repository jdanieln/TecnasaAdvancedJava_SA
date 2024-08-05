package com.example.solid.dip.after;

public class EmailService implements NotificationService {
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}