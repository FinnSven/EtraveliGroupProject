package com.etraveligroup.refactoring.movieRental.model;

public class CultMoviePricingStrategy implements PricingStrategy, Searchable {
    private final double sourcingFee;

    public CultMoviePricingStrategy(double sourcingFee) {
        this.sourcingFee = sourcingFee;
    }

    @Override
    public double calculatePrice(int daysRented) {
        double base = 10.0 + (daysRented * 2); // example
        return base + sourcingFee;
    }

    @Override
    public int calculatePoints(int daysRented) {
        return 1 + (daysRented > 2 ? 1 : 0);
    }

    @Override
    public String searchForCopy(String movieTitle) {
        // Call your AI API here (mocked for now)
        return "AI API: Searching for cult movie '" + movieTitle + "'... found rare copy!";
    }
}
