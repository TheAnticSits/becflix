package org.launchcode.becflix.Models;

public class Movie {

//    private int id;
    private String movieName;
    private int year;
    private String genre;
    private String director;
    private String franchise;
    private String rating;
    private String importance;
//    private Array keywords;



    public Movie(){
        this.movieName = movieName;
        this.year = year;
        this.genre = genre;
        this.director = director;
        this.franchise = franchise;
        this.rating = rating;
        this.importance = importance;
    }

    public String getTitle() {
        return movieName;
    }

    public void setTitle(String title) {
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
