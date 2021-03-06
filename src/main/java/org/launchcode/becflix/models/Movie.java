
package org.launchcode.becflix.models;

import org.hibernate.validator.constraints.Range;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class Movie {

    private int movieId;

    @NotBlank(message = "Must have a TV Show Name.")
    @Size(min = 1, max = 40)
    private String movieName;

    @Range(min = 1, message = "Must enter the year it began.")

    private String month;
    private String dayOfMonth;
    private String year;



    private String genre;
    private String director;
    private String franchise;

    private String rating;
    private String importance;
    private String type;
    private static int nextId = 1;



    public Movie(String movieName, String month, String dayOfMonth, String year, String genre, String director, String franchise, String rating, String importance, String type) {
        this();

        this.movieName = movieName;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.year = year;
        this.genre = genre;
        this.director = director;
        this.franchise = franchise;
        this.rating = rating;
        this.importance = importance;
        this.type = type;
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

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
