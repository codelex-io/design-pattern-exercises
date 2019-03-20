package io.codelex.structural.adapter

import spock.lang.Specification

class AdapterPatternExerciseSpec extends Specification {
    def exercise = new AdapterPatternExercise()

    def 'should charge phone'() {
        given:
            def charger = new EuropePhoneCharger()
        when:
            exercise.chargePhone(charger)
        then:
            charger.charging
    }
}
