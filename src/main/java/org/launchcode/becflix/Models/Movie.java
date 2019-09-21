package org.launchcode.becflix.Models;

public class Movie {

    private String title;
    private int year;
    private String director;
    private String genre;
    private int rating;
    private String importance;

    public Movie(){
        this.title = title;
        this.year = year;
        this.director = director;
        this.genre = genre;
        this.rating = rating;
        this.importance = importance;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }
}
