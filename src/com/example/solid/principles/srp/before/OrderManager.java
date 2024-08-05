package com.example.solid.principles.srp.before;

import java.util.ArrayList;

public class OrderManager {

    private final ArrayList<String> orders = new ArrayList<>();


    // Método para agregar un pedido
    public void addOrder(String order) {
        orders.add(order);
        processOrder(order);
        sendNotification(order);
        updateStatus(order);
    }

    // Método para procesar el pedido
    private void processOrder(String order) {
        System.out.println("Processing order: " + order);
    }

    // Método para enviar notificaciones
    private void sendNotification(String order) {
        System.out.println("Sending notification for order: " + order);
    }

    // Método para actualizar el estado
    private void updateStatus(String order) {
        System.out.println("Updating status for order: " + order);
    }
}
