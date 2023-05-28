package com.rental.rentalService;

public class Movie {
    private Long id;
    private String name;
    private String category;
    private int releaseYear;
    private double rating;

    // Default constructor
    public Movie() {
    }

    // Parameterized constructor
    public Movie(Long id, String name, String category, int releaseYear, double rating) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
