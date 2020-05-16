package org.launchcode.becflix.models.enums;

public enum Month {

    JANUARY("JAN"),
    FEBRUARY("FEB"),
    MARCH("MAR"),
    APRIL("APR"),
    MAY("MAY"),
    JUNE("JUN"),
    JULY("JUL"),
    AUGUST("AUG"),
    SEPTEMBER("SEP"),
    OCTOBER("OCT"),
    NOVEMBER("NOV"),
    DECEMBER("DEC");

    private final String displayMonth;

    Month(String displayMonth) {
        this.displayMonth = displayMonth;
    }

    public String getDisplayMonth() {
        return displayMonth;
    }

}
