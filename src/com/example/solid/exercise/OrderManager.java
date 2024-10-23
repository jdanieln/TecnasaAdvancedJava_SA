package com.example.solid.exercise;

class OrderManager {
    private InvoiceGenerator invoiceGenerator;
    private List<NotificationService> notificationServices;

    public OrderManager(InvoiceGenerator invoiceGenerator, List<NotificationService> notificationServices) {
        this.invoiceGenerator = invoiceGenerator;
        this.notificationServices = notificationServices;
    }

    public void processOrder(Order order) {
        invoiceGenerator.generateInvoice(order);
        for (NotificationService service : notificationServices) {
            service.sendNotification(order);
        }
    }
}