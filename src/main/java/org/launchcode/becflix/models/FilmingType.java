package org.launchcode.becflix.models;

public enum FilmingType {

    LIVEACTION("Live Action"),
    ANIMATION("Animation"),
    CROSSOVER("Combination of Live and Animation");

    private final String displayName;

    FilmingType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
