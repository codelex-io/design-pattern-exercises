package io.codelex.creational.factorymethod

import spock.lang.Specification

import static io.codelex.creational.factorymethod.Side.ALLIED
import static io.codelex.creational.factorymethod.Side.SOVIET
import static io.codelex.creational.factorymethod.Weapon.Type.GUN
import static io.codelex.creational.factorymethod.Weapon.Type.LASER

class FactoryMethodPatternExerciseSpec extends Specification {

    def 'should create allied weapons'() {
        given:
            def factory = Mock(WeaponFactory) //todo
            def exercise = new FactoryMethodPatternExercise(factory)
        when:
            def gun = exercise.createWeapon(GUN)
            def laser = exercise.createWeapon(LASER)
        then:
            gun.side() == ALLIED
            gun.type() == GUN
        and:
            laser.side() == ALLIED
            laser.type() == LASER
    }

    def 'should create soviet weapons'() {
        given:
            def factory = Mock(WeaponFactory) //todo
            def exercise = new FactoryMethodPatternExercise(factory)
        when:
            def gun = exercise.createWeapon(GUN)
            def laser = exercise.createWeapon(LASER)
        then:
            gun.side() == SOVIET
            gun.type() == GUN
        and:
            laser.side() == SOVIET
            laser.type() == LASER
    }
}
