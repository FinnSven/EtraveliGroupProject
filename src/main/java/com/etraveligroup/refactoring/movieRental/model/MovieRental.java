package com.etraveligroup.refactoring.movieRental.model;

import java.util.Objects;
public class MovieRental {
    private final Movie movie;
    private final int daysRented;

    public MovieRental(Movie movie, int daysRented) {
        if (daysRented <1) throw new IllegalArgumentException("daysRented must be >= 1");
        this.movie = Objects.requireNonNull(movie);
        this.daysRented = daysRented;
    }

    public double getPrice() {
        return movie.calculatePrice(daysRented);
    }
    public int getPoints() {
        return movie.calculatePoints(daysRented);
    }

    public Movie getMovie() { return movie; }
    public int getDaysRented() { return daysRented; }
}
