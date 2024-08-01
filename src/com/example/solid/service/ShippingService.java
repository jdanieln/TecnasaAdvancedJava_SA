package com.example.solid.service;

import com.example.solid.model.Order;

public class ShippingService {
    public void shipOrder(Order order) {
        System.out.println("Shipping order: " + order);
    }
}
