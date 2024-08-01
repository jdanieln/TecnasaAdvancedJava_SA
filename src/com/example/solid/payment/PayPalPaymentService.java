package com.example.solid.payment;

public class PayPalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal payment processed: " + amount);
    }
}
