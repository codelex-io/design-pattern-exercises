package io.codelex.behavioral.strategy

import spock.lang.Specification

import static io.codelex.behavioral.strategy.AttackType.HIT
import static io.codelex.behavioral.strategy.AttackType.SHOOT

class StrategyPatternExerciseSpec extends Specification {
    def exercise = new StrategyPatternExercise()

    def 'soldier should be able to attack in multiple ways'() {
        given:
            def soldier = new Soldier()
        when:
            soldier.changeStrategy()
        then:
            exercise.useSoldierForAttack(soldier) == HIT
        when:
            soldier.changeStrategy()
        then:
            exercise.useSoldierForAttack(soldier) == SHOOT
    }
}
