package com.etraveligroup.refactoring.movieRental.model;
import java.util.Objects;
public class Movie {
    private final String title;
    private final PricingStrategy pricingStrategy;

    public Movie(String title, PricingStrategy pricingStrategy) {
        this.title = title;
        this.pricingStrategy = pricingStrategy;
    }

    public String getTitle() { return title; }

    public double calculatePrice(int daysRented) {
        return pricingStrategy.calculatePrice(daysRented);
    }

    public int calculatePoints(int daysRented) {
        return pricingStrategy.calculatePoints(daysRented);
    }
}
