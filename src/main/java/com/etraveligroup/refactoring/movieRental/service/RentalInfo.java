package com.etraveligroup.refactoring.movieRental.service;

public class RentalInfo {
    private final double amount;
    private final int frequentRenterPoints;

    public RentalInfo(double amount, int frequentRenterPoints){
        this.amount = amount;
        this.frequentRenterPoints = frequentRenterPoints;
    }

    public double getAmount() {
        return amount;
    }

    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }
}
