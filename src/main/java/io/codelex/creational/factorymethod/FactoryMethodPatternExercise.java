package io.codelex.creational.factorymethod;

class FactoryMethodPatternExercise {
    private final WeaponFactory factory;

    FactoryMethodPatternExercise(WeaponFactory factory) {
        this.factory = factory;
    }

    public Weapon createWeapon(Weapon.Type type) {
        return factory.manufacture(type);
    }
}
