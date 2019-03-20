package io.codelex.creational.prototype;

class Roof {
    enum Type {
        ASPHALT_SHINGLES, METAL, SLATE
    }

    private final Type type;

    Roof(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
