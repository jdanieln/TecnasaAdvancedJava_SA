package com.example.solid.exercise;

class SMSService implements NotificationService {
    @Override
    public void sendNotification(Order order) {
        System.out.println("Sending SMS to " + order.getCustomerPhone() + ": Your order has been processed.");
    }
}