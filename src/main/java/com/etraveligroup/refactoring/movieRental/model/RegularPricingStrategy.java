package com.etraveligroup.refactoring.movieRental.model;

public class RegularPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(int daysRented) {
        double amount = 2;
        if (daysRented > 2) amount += (daysRented - 2) * 1.5;
        return amount;
    }
    @Override
    public int calculatePoints(int daysRented) { return 1; }
}
