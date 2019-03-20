package io.codelex.creational.abstractfactory;

interface UnitFactory {
    Soldier createSoldier();

    Plane createPlane();

    Tank createTank();
}
