package io.codelex.creational.prototype;

import java.util.List;

import static io.codelex.creational.prototype.Door.Type.METAL;
import static io.codelex.creational.prototype.Door.Type.WOOD;
import static io.codelex.creational.prototype.Roof.Type.ASPHALT_SHINGLES;
import static java.util.Arrays.asList;

class PrototypePatternExercise {
    private static final House HOUSE_PROTOTYPE;

    static {
        List<Door> doors = asList(
                new Door(WOOD, 220, 120),
                new Door(METAL, 230, 130)
        );
        List<Window> windows = asList(
                new Window(180, 280),
                new Window(120, 100),
                new Window(120, 240)
        );

        HOUSE_PROTOTYPE = new House(
                new Roof(ASPHALT_SHINGLES),
                doors,
                windows
        );
    }

    House getPrototype() {
        return HOUSE_PROTOTYPE;
    }

    House copy(House house) {
        throw new UnsupportedOperationException();
    }
}
