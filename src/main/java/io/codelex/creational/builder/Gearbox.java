package io.codelex.creational.builder;

class Gearbox {
    enum Type {
        AUTOMATIC, MANUAL
    }

    private final Type type;
    private final int gears;

    Gearbox(Type type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    public Type getType() {
        return type;
    }

    public int getGears() {
        return gears;
    }
}
