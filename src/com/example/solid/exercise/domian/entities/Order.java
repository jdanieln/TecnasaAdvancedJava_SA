package com.example.solid.exercise;

public class Order {
    private String id;
    private String customerEmail;
    private String customerPhone;
    private double amount;

    public Order(String id, String customerEmail, String customerPhone, double amount) {
        this.id = id;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public double getAmount() {
        return amount;
    }
}