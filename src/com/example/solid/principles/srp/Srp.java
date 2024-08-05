package com.example.solid.principles.srp;

import com.example.solid.principles.srp.after.NotificationService;
import com.example.solid.principles.srp.after.OrderManager;
import com.example.solid.principles.srp.after.OrderStatusUpdater;

public class Srp {
    public void run() {
        NotificationService notificationService = new NotificationService();
        OrderStatusUpdater statusUpdater = new OrderStatusUpdater();
        OrderManager orderManager = new OrderManager(notificationService, statusUpdater);
        orderManager.addOrder("Order123");
    }
}
