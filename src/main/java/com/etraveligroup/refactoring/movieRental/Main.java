package com.etraveligroup.refactoring.movieRental;

import com.etraveligroup.refactoring.movieRental.model.*;
import com.etraveligroup.refactoring.movieRental.service.RentalService;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");

        Movie m1 = new Movie("Thunderbolts*", new NewReleasePricingStrategy());
        Movie m2 = new Movie("Lilo and Stitch", new RegularPricingStrategy());
        Movie m3 = new Movie("El Topo", new CultMoviePricingStrategy(12.5)); // with sourcing fee
        Movie m4 = new Movie("Return of the King", new RegularPricingStrategy());

        customer.addRental(new MovieRental(m1, 3));
        customer.addRental(new MovieRental(m2, 4));
        customer.addRental(new MovieRental(m3, 3));
        customer.addRental(new MovieRental(m4, 4));

        RentalService service = new RentalService();
        System.out.println(service.generateStatement(customer));
    }
}
