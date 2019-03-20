package io.codelex.creational.prototype;

class Door {
    enum Type {
        WOOD, METAL
    }

    private final Type type;
    private final int height;
    private final int width;

    Door(Type type, int height, int width) {
        this.type = type;
        this.height = height;
        this.width = width;
    }

    public Type getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
