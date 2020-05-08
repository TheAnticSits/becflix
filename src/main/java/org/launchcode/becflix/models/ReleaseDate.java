package org.launchcode.becflix.models;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.DateFormat;

public class ReleaseDate {

    @DateTimeFormat(style = "MM/dd/yyyy")
    private DateFormat releaseDate;

    public ReleaseDate(DateFormat releaseDate){
        this.releaseDate = releaseDate;
        System.out.println(releaseDate);
        System.out.println("Trial");
    }

    public DateFormat getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(DateFormat releaseDate) {
        this.releaseDate = releaseDate;
    }
}
