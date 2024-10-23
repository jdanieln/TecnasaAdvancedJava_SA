package com.example.solid.exercise;

class EmailService implements NotificationService {
    @Override
    public void sendNotification(Order order) {
        System.out.println("Sending email to " + order.getCustomerEmail() + ": Your order has been processed.");
    }
}
