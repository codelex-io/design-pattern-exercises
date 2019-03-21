package io.codelex.behavioral.strategy;

class StrategyPatternExercise {
    AttackType useSoldierForAttack(Soldier soldier) {
        return soldier.attack();
    }
}
