package com.etraveligroup.refactoring.movieRental.model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
public class Customer {
    private final String name;
    private final List<MovieRental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = Objects.requireNonNull(name);
    }

    public String getName() {
        return name;
    }

    public List<MovieRental> getRentals(){
        return Collections.unmodifiableList(rentals);
    }

    public void addRental(MovieRental rental){
        rentals.add(Objects.requireNonNull(rental));
    }
}
