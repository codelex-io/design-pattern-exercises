package io.codelex.behavioral.strategy;

class Soldier {

    void changeStrategy(AttackStrategy strategy) {
        throw new UnsupportedOperationException();
    }

    AttackType attack() {
        throw new UnsupportedOperationException();
    }
}
