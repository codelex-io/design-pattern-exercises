package io.codelex.creational.abstractfactory

import spock.lang.Specification

import static io.codelex.creational.abstractfactory.Side.ALLIED
import static io.codelex.creational.abstractfactory.Side.SOVIET

class AbstractFactoryPatternExerciseSpec extends Specification {
    def exercise = new AbstractFactoryPatternExercise()

    def 'should create allied units only'() {
        given:
            def factory = exercise.make(ALLIED)
        when:
            def soldier = factory.createSoldier()
            def plane = factory.createPlane()
            def tank = factory.createTank()
        then:
            soldier.side() == ALLIED
            plane.side() == ALLIED
            tank.side() == ALLIED
    }

    def 'should create soviet units only'() {
        given:
            def factory = exercise.make(SOVIET)
        when:
            def soldier = factory.createSoldier()
            def plane = factory.createPlane()
            def tank = factory.createTank()
        then:
            soldier.side() == SOVIET
            plane.side() == SOVIET
            tank.side() == SOVIET
    }
}
