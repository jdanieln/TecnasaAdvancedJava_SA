public class Main {
    public static void main(String[] args) {
        NotificationSender emailSender = new EmailSender();
        InvoiceService invoiceService = new InvoiceService();
        OrdenService ordenService = new OrdenService(emailSender, invoiceService);
        
        Orden orden = new Orden("1", "correo@gmail.com", "821376472", 1000.00);
        ordenService.addOrder(orden);
    }
}
