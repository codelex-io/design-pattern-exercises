package io.codelex.behavioral.chainofresponsibility

import spock.lang.Specification

import static io.codelex.behavioral.chainofresponsibility.IncomingCall.Type.*

class ChainOfResponsibilityPatternExerciseSpec extends Specification {
    def exercise = new ChainOfResponsibilityPatternExercise()

    def 'should process "information about last bill" on answering machine only'() {
        given:
            def call = new IncomingCall(INFORMATION_ABOUT_LAST_BILL)
        when:
            exercise.handle(call)
        then:
            call.handled
        and:
            call.handlers.size() == 1
            call.handlers[0] == 'answering-machine'
    }

    def 'should process "forgot password" on answering machine & first level support operator'() {
        given:
            def call = new IncomingCall(FORGOT_PASSWORD)
        when:
            exercise.handle(call)
        then:
            call.handled
        and:
            call.handlers.size() == 2
            call.handlers[0] == 'first-level-support-operator'
            call.handlers[1] == 'answering-machine'
    }

    def 'should process "technical problem" on answering machine & first level operator & technical support'() {
        given:
            def call = new IncomingCall(TECHNICAL_PROBLEM)
        when:
            exercise.handle(call)
        then:
            call.handled
        and:
            call.handlers.size() == 3
            call.handlers[0] == 'technical-support'
            call.handlers[1] == 'first-level-support-operator'
            call.handlers[2] == 'answering-machine'
    }
}
