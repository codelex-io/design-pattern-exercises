package io.codelex.structural.proxy

import spock.lang.Specification

class ProxyPatternExerciseSpec extends Specification {
    
    def 'should not allow to consume more times than in balance'() {
        given:
            def exercise = new ProxyPatternExercise()
            def user = new User(2)
        when:
            exercise.findForecast(user)
            exercise.findForecast(user)
        then:
            noExceptionThrown()
        when:
            exercise.findForecast(user)
        then:
            thrown NoBalanceAvailable
    }
}
