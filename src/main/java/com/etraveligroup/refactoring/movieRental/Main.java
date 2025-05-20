package com.etraveligroup.refactoring.movieRental;

import com.etraveligroup.refactoring.movieRental.model.Customer;
import com.etraveligroup.refactoring.movieRental.model.Movie;
import com.etraveligroup.refactoring.movieRental.model.MovieRental;
import com.etraveligroup.refactoring.movieRental.service.RentalService;

import com.etraveligroup.refactoring.movieRental.model.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");
        Movie m1 = new Movie("Thunderbolts*", Movie.Type.NEW_RELEASE);
        Movie m2 = new Movie("Lilo and Stich", Movie.Type.CHILDRENS);
        Movie m3 = new Movie("El Topo", Movie.Type.CULT);
        Movie m4 = new Movie("Return of the King", Movie.Type.REGULAR);

        customer.addRental(new MovieRental(m1, 3 ));
        customer.addRental(new MovieRental(m2, 4));
        customer.addRental(new MovieRental(m3, 3 ));
        customer.addRental(new MovieRental(m4, 4));

        RentalService service = new RentalService();
        System.out.println(service.generateStatement(customer));
    }
}
