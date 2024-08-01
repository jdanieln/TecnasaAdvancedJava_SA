package com.example.solid.service;

import com.example.solid.model.Order;
import com.example.solid.model.OrderItem;

public class InventoryService {
    public void updateInventory(Order order) {
        for(OrderItem item: order.getItems()) {
            System.out.println("Updating inventory for item: " + item.toString());
        }
    }
}
