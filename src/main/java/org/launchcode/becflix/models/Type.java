package org.launchcode.becflix.models;

public enum Type {

    LIVEACTION("Live Action"),
    ANIMATION("Animation"),
    CROSSOVER("Combination of Live and Animation");

    private final String displayType;

    Type(String displayType){
        this.displayType = displayType;
    }

    public String getDisplayType() {
        return displayType;
    }
}
