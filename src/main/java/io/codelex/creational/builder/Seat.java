package io.codelex.creational.builder;

class Seat {
    enum Type {
        LEATHER, RAG
    }

    private final Type type;
    private final boolean sport;
    private final boolean heated;
    private final boolean electric;

    Seat(Type type, boolean sport, boolean heated, boolean electric) {
        this.type = type;
        this.sport = sport;
        this.heated = heated;
        this.electric = electric;
    }

    public Type getType() {
        return type;
    }

    public boolean isSport() {
        return sport;
    }

    public boolean isHeated() {
        return heated;
    }

    public boolean isElectric() {
        return electric;
    }
}
