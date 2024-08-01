package com.example.solid.discount;

public class FixedAmountDiscount implements DiscountStrategy{
    private double fixedAmount;
    public FixedAmountDiscount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }
    @Override
    public double applyDiscount(double total) {
        return total - fixedAmount;
    }
}
