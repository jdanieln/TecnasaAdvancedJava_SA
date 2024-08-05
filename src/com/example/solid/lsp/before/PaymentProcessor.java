package com.example.solid.lsp.before;

public class PaymentProcessor {
    public void makePayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }
}
