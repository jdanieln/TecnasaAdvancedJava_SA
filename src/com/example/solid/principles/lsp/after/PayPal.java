package com.example.solid.principles.lsp.after;

public class PayPal implements PaymentMethod {
    private static final double MAX_AMOUNT = 1000;

    @Override
    public void processPayment(double amount) {
        if (amount > MAX_AMOUNT) {
            throw new UnsupportedOperationException("PayPal does not support payments over $" + MAX_AMOUNT);
        }
        System.out.println("Processing PayPal payment of $" + amount);
    }
}