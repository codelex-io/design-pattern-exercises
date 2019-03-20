package io.codelex.creational.singleton

import spock.lang.Specification

class SingletonPatternExerciseSpec extends Specification {
    def exercise1 = new SingletonPatternExercise()
    def exercise2 = new SingletonPatternExercise()

    def 'should be the same'() {
        when:
            def db1 = exercise1.database
            def db2 = exercise2.database
        then:
            db1.is(db2)
    }
}
