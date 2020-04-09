
package org.launchcode.becflix.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Movie {

    private int movieId;

    @NotBlank(message = "Must have a TV Show Name.")
    @Size(min = 1, max = 40)
    private String movieName;
    private int year;
    private String genre;
    private String director;
    private String franchise;
    private String rating;
    private String importance;

    private static int nextId = 1;
//    private Array keywords;

    public Movie(String movieName, int year, String genre, String director, String franchise, String rating, String importance) {
        this();
//        calls the default constructor
        this.movieName = movieName;
        this.year = year;
        this.genre = genre;
        this.director = director;
        this.franchise = franchise;
        this.rating = rating;
        this.importance = importance;
    }

    public Movie() {
        movieId = nextId;
        nextId++;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String title) {
        this.movieName = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getFranchise() {
        return franchise;
    }

    public void setFranchise(String franchise) {
        this.franchise = franchise;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }


}
