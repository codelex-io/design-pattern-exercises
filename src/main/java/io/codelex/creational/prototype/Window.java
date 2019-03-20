package io.codelex.creational.prototype;

class Window {
    private final int height;
    private final int width;

    Window(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
