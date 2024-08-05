package com.example.solid.principles.srp.after;

import java.util.ArrayList;

public class OrderManager {
    private final ArrayList<String> orders = new ArrayList<>();
    private final NotificationService notificationService;
    private final OrderStatusUpdater statusUpdater;

    public OrderManager(NotificationService notificationService, OrderStatusUpdater statusUpdater) {
        this.notificationService = notificationService;
        this.statusUpdater = statusUpdater;
    }

    // Método para agregar un pedido
    public void addOrder(String order) {
        orders.add(order);
        processOrder(order);
    }

    // Método para procesar el pedido
    private void processOrder(String order) {
        System.out.println("Processing order: " + order);
        notificationService.sendNotification(order);
        statusUpdater.updateStatus(order);
    }
}
