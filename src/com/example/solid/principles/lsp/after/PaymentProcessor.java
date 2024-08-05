package com.example.solid.principles.lsp.after;

public class PaymentProcessor {
    public void makePayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }
}