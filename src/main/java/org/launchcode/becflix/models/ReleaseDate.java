package org.launchcode.becflix.models;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ReleaseDate {

    private Date releaseDate;

    public ReleaseDate(Date releaseDate){
        this.releaseDate = releaseDate;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
