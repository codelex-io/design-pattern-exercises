package io.codelex.behavioral.visitor;

import java.util.List;

class VisitorPatternExercise {
    private final List<Visitable> items;

    VisitorPatternExercise(List<Visitable> items) {
        this.items = items;
    }

    String asJson() {
        throw new UnsupportedOperationException();
    }

    String asXml() {
        throw new UnsupportedOperationException();
    }
}
