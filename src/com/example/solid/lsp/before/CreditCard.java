package com.example.solid.lsp.before;

public class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}