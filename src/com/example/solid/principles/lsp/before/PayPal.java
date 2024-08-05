package com.example.solid.principles.lsp.before;

public class PayPal extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        // Simulando un error si la cantidad es mayor de lo permitido para PayPal
        if (amount > 1000) {
            throw new UnsupportedOperationException("PayPal does not support payments over $1000");
        }
        System.out.println("Processing PayPal payment of $" + amount);
    }
}