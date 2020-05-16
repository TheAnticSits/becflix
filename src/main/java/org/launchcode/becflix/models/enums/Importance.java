package org.launchcode.becflix.models.enums;

public enum Importance {

    HAVENTDECIDED("Haven't decided yet"),
    EXTREMELYIMPORTANT("Extremely Important"),
    SUPERIMPORTANT("Super Important"),
    VERYIMPORTANT("Very Important"),
    IMPORTANT("Important"),
    NOTURGENT("Not Urgent"),
    ITCANWAIT("It can wait"),
    KINDAWANTTOSEEIT("Kinda Want To See It"),
    MEH("Meh");

    private final String displayImportance;

    Importance(String displayImportance) {
        this.displayImportance = displayImportance;
    }

    public String getDisplayImportance() {
        return displayImportance;
    }
}
