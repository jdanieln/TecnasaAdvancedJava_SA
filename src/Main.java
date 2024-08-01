import com.example.solid.discount.DiscountStrategy;
import com.example.solid.discount.PercentageDiscount;
import com.example.solid.model.Order;
import com.example.solid.model.OrderItem;
import com.example.solid.payment.PayPalPaymentService;
import com.example.solid.payment.PaymentProcessor;
import com.example.solid.payment.PaymentService;
import com.example.solid.service.InventoryService;
import com.example.solid.service.OrderTotalCalculator;
import com.example.solid.service.ShippingService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DiscountStrategy discountStrategy = new PercentageDiscount(10);
        Order order = new Order();
        order.addItem(new OrderItem("Laptop", 1000));
        order.addItem(new OrderItem("Tablet", 2000));

        OrderTotalCalculator totalCalculator = new OrderTotalCalculator(discountStrategy);
        double totalWithDiscount = totalCalculator.calculateTotal(order);
        System.out.println("Total with discount" + totalWithDiscount);

        InventoryService inventoryService = new InventoryService();
        inventoryService.updateInventory(order);

        PaymentService paymentService = new PayPalPaymentService();
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentService);
        paymentProcessor.processPayment(totalWithDiscount);

        ShippingService shippingService = new ShippingService();
        shippingService.shipOrder(order);

    }
}