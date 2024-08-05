package com.example.solid.lsp.after;

public class PaymentProcessor {
    public void makePayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }
}