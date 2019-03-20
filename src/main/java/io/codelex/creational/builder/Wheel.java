package io.codelex.creational.builder;

class Wheel {
    enum Season {
        WINTER, SUMMER
    }

    private final Season season;
    private final int rimSize;

    Wheel(Season season, int rimSize) {
        this.season = season;
        this.rimSize = rimSize;
    }

    public Season getSeason() {
        return season;
    }

    public int getRimSize() {
        return rimSize;
    }
}
