package com.etraveligroup.refactoring.movieRental.service;

import com.etraveligroup.refactoring.movieRental.model.Customer;
import com.etraveligroup.refactoring.movieRental.model.MovieRental;
import com.etraveligroup.refactoring.movieRental.model.RentalInfo;


// Contains business logic, (make abstract or as an interface for unit testing?)
public class RentalService {

    public RentalInfo calculateRental(MovieRental rental) {
        double amount = rental.getPrice();
        int points = rental.getPoints();
        return new RentalInfo(amount, points);
    }

    public String generateStatement(Customer customer) {
        StringBuilder result = new StringBuilder("Rental Record for " + customer.getName() + "\n");
        double totalAmount = 0;
        int totalPoints = 0;

        for (MovieRental rental : customer.getRentals()) {
            RentalInfo info = calculateRental(rental);
            totalAmount += info.getAmount();
            totalPoints += info.getFrequentRenterPoints();

            result.append("\t").append(rental.getMovie().getTitle())
                    .append("\t").append(info.getAmount()).append("\n");
        }

        result.append("Amount owed is ").append(totalAmount).append("\n");
        result.append("You earned ").append(totalPoints).append(" return rental points");
        return result.toString();
    }
}
