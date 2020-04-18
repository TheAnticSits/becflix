package org.launchcode.becflix.models;

public enum FilmingType {

    ANIMATION("Animation"),
    LIVEACTION("Live Action"),
    CROSSOVER("Combination of Live and Animation");

    private final String displayName;

    FilmingType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
