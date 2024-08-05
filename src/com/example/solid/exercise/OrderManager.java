package com.example.solid.exercise;

public class OrderManager {
    private EmailService emailService;
    private SMSService smsService;
    private InvoiceGenerator invoiceGenerator;

    public OrderManager() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
        this.invoiceGenerator = new InvoiceGenerator();
    }

    public void processOrder(Order order) {
        invoiceGenerator.generateInvoice(order);
        emailService.sendEmail(order.getCustomerEmail(), "Your order has been processed.");
        smsService.sendSMS(order.getCustomerPhone(), "Your order has been processed.");
    }
}