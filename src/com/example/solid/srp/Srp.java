package com.example.solid.srp;

import com.example.solid.srp.after.NotificationService;
import com.example.solid.srp.after.OrderManager;
import com.example.solid.srp.after.OrderStatusUpdater;

public class Srp {
    public void run() {
        NotificationService notificationService = new NotificationService();
        OrderStatusUpdater statusUpdater = new OrderStatusUpdater();
        OrderManager orderManager = new OrderManager(notificationService, statusUpdater);
        orderManager.addOrder("Order123");
    }
}
