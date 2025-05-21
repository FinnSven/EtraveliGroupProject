package com.etraveligroup.refactoring.movieRental.model;

public class NewReleasePricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(int daysRented) {
        return daysRented * 3;
    }
    @Override
    public int calculatePoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}