package io.codelex.creational.prototype;

import java.util.List;

class House {
    private final Roof roof;
    private final List<Door> doors;
    private final List<Window> windows;

    House(Roof roof, List<Door> doors, List<Window> windows) {
        this.roof = roof;
        this.doors = doors;
        this.windows = windows;
    }

    public Roof getRoof() {
        return roof;
    }

    public List<Door> getDoors() {
        return doors;
    }

    public List<Window> getWindows() {
        return windows;
    }
}
