package com.etraveligroup.refactoring.movieRental.model;

public interface PricingStrategy {
    double calculatePrice(int daysRented);
    int calculatePoints(int daysRented);
}
