package com.example.solid.lsp;

import com.example.solid.lsp.after.CreditCard;
import com.example.solid.lsp.after.PayPal;
import com.example.solid.lsp.after.PaymentMethod;
import com.example.solid.lsp.after.PaymentProcessor;

/*import com.example.solid.lsp.before.CreditCard;
import com.example.solid.lsp.before.PayPal;
import com.example.solid.lsp.before.PaymentMethod;
import com.example.solid.lsp.before.PaymentProcessor;*/

public class Lsp {
    public void run() {

        PaymentProcessor processor = new PaymentProcessor();
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payPal = new PayPal();

        processor.makePayment(creditCard, 500);  // Works fine
        processor.makePayment(payPal, 500);  // Works fine
        processor.makePayment(payPal, 1500);    // Throws exception

        /*PaymentProcessor processor = new PaymentProcessor();
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod payPal = new PayPal();

        processor.makePayment(creditCard, 500);  // Works fine
        processor.makePayment(payPal, 500);     // Works fine
        processor.makePayment(payPal, 1500);*/    // Throws exception, but PayPal's behavior is now predictable
    }
}
