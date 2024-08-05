package com.example.solid.principles.dip.before;

// Clase de bajo nivel para enviar correos electrónicos
public class EmailService {
    public void sendEmail(String recipient, String message) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}