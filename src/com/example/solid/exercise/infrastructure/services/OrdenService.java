package com.example.solid.exercise.infrastructure.services;

public class OrdenService {
    private final NotificationSender notificationSender;
    private final InvoiceService invoiceService;

    public OrdenService(NotificationSender notificationSender, InvoiceService invoiceService) {
        this.notificationSender = notificationSender;
        this.invoiceService = invoiceService;
    }

    public void addOrder(Orden orden) {
        order.addOrder();
        notificationSender.sendNotification("Orden creada");
        invoiceService.generateInvoice(orden);
    }

}