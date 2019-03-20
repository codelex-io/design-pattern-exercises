package io.codelex.creational.factorymethod;

interface WeaponFactory {
    Weapon manufacture(Weapon.Type type);
}
