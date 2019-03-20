package io.codelex.creational.builder;

class Engine {
    enum Type {
        DIESEL, ELECTRICAL, PETROL;
    }

    private final Type type;
    private final int horsePower;

    Engine(Type type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    public Type getType() {
        return type;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
