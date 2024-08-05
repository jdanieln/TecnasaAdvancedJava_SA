package com.example.solid.principles.dip.before;

// Clase de bajo nivel para enviar mensajes de texto
public class SMSService {
    public void sendSMS(String phoneNumber, String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}