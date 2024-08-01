package com.example.solid.payment;

public class CreditCardPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Credit Card payment processed: " + amount);
    }
}
