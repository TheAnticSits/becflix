package org.launchcode.becflix.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Show {

    private int showId;

//    @NotBlank(message = "Must have a TV Show Name.")
//    @Size(min = 1, max = 40)
    private String name;

//    @NotBlank(message = "Must enter the year this show started.")
    private String month;
    private String dayOfMonth;
    private String year;

//    private String actor;
    private String genre;
    private String importance;
    private static int nextId = 1;
//    private Array keywords;
//    private String spinoff;


    public Show(String name, String month, String dayOfMonth, String year, String genre, String importance){
        this.name = name;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }
}
