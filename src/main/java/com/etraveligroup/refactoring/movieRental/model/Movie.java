package com.etraveligroup.refactoring.movieRental.model;
import java.util.Objects;
public class Movie {
    public enum Type {REGULAR, NEW_RELEASE, CHILDRENS, CULT }

    private final String title;
    private final Type type;

    public Movie(String title, Type type) {


        this.title = Objects.requireNonNull(title);
        this.type = Objects.requireNonNull(type);
    }

        public String getTitle() {
            return title;
        }

        public Type getType() {
        return type;
        }
}
