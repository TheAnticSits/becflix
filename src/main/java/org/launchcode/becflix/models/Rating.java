package org.launchcode.becflix.models;

public enum Rating {

    IDONTKNOW("I don't Know"),
    RATEDG("Rated G"),
    RATEDPG("Rated PG"),
    RATEDPG13("Rated PG-13"),
    RATEDR("Rated R"),
    RATEDNC17("Rated NC-17"),
    NOTRATED("Not Rated");

    private final String displayRating;

    Rating(String displayRating) {
        this.displayRating = displayRating;
    }

    public String getDisplayRating() {
        return displayRating;
    }
}
