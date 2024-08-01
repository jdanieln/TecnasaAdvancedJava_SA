package com.example.solid.service;

import com.example.solid.discount.DiscountStrategy;
import com.example.solid.model.Order;

public class OrderTotalCalculator {
    private DiscountStrategy discountStrategy;

    public OrderTotalCalculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal(Order order) {
        double total = order.getTotal();
        return discountStrategy.applyDiscount(total);
    }
}
