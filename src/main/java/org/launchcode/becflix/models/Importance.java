package org.launchcode.becflix.models;

public enum Importance {



    LIVEACTION("Live Action"),
    UNSURE("UNSURE"),
    EXTREMELYIMPORTANT("Extremely Important"),
    SUPERIMPORTANT("Super Important"),
    VERYIMPORTANT("Very Important"),
    IMPORTANT("Important"),
    NOTURGENT("Not Urgent"),
    ITCANWAIT("It can wait"),
    KINDAWANTTOSEEIT("Kinda Want To See It"),
    MEH("Meh");

    private final String importanceRank;

    Importance(String importanceRank) {
        this.importanceRank = importanceRank;
    }

    public String getImportanceRank() {
        return importanceRank;
    }
}
