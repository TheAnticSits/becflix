package org.launchcode.becflix.models;

public enum GenreType {

    UNKNOWN("I Don't Know"),
    ACTION("Action"),
    ADULT("Adult"),
    ADVENTURE("Adventure"),
    ANIME("Anime"),
    BIOGRAPHICAL("Biographical"),
    BUDDY("Buddy"),
    CHICKFLICK("Chick Flick"),
    COMEDY("Comedy"),
    CONCERT("Concert"),
    CRIME("Crime"),
    DARKCOMEDY("Dark Comedy"),
    DISASTER("Disaster"),
    DOCUMENTARY("Documentary"),
    DRAMA("Drama"),
    EPIC("Epic"),
    EXPLOITATION("Exploitation"),
    FAMILY("Family"),
    FANTASY("Fantasy"),
    GANGSTER("Gangster"),
    HEIST("Heist"),
    HISTORICAL("Historical"),
    HORROR("Horror"),
    LEGALDRAMA("Legal Drama"),
    MARTIALARTS("Martial Arts"),
    MOCKUMENTARY("Mockumentary"),
    MUSICAL("Musical"),
    MYSTERY("Mystery"),
    NOIR("Noir"),
    PARODY("Parody"),
    PSYCHOLOGICALTHRILLER("Psychological Thriller"),
    ROMANCE("Romance"),
    ROMCOM("Romantic Comedy"),
    SCIFI("Science Fiction"),
    SILENTFILM("Silent Film"),
    SLASHER("Slasher"),
    SPORTS("Sports"),
    SPY("Spy"),
    SUPERHERO("Superhero"),
    SWASHBUCKLER("Swashbuckler"),
    TEEN("Teen"),
    THRILLER("Thriller"),
    WAR("War"),
    WESTERN("Western");

    private final String displayGenre;

    GenreType(String displayGenre) {
        this.displayGenre = displayGenre;
    }

    public String getDisplayGenre() {
        return displayGenre;
    }
}

