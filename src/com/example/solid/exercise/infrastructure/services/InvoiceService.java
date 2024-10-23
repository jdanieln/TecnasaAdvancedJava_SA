
public class InvoiceService implements GenerateDocument {
    @Override
    public void generate(Orden orden) {
        // Lógica para generar factura
        System.out.println("Factura generada para la orden: " + orden.getId());
    }
}