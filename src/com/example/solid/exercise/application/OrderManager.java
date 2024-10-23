package com.example.solid.exercise;

public class OrderManager {
    private List<INotification> notificatios = new List<>();
    private InvoiceService invoiceService;

    public OrderManager( List<INotification> notifications, InvoiceService invoiceService) {
        this.notification = notifications;
        this.invoiceService = invoiceService;
    }

    public void processOrder(Order order) {
        invoiceService.generateInvoice(order);
        for (INotification notify : notificatios){
            notify.send("La orden con ID " + order.getId() + " ha sido creada.");
        }
    }   
}