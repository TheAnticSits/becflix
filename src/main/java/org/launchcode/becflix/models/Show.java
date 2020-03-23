package org.launchcode.becflix.models;

public class Show {
    private int showId;
    private String title;
    private int year;
//    private String actor;
    private String genre;
    private String importance;
    private static int nextId = 1;
//    private Array keywords;
//    private String spinoffOf;


    public Show(String title, int year, String genre, String importance){
        this.title = title;
        this.year = year;
//        this.actor = actor;
        this.genre = genre;
        this.importance = importance;
    }

    public Show() {
        showId = nextId;
        nextId++;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }
}
