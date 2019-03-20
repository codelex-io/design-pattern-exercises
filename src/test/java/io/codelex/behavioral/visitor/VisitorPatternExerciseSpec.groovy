package io.codelex.behavioral.visitor

import groovy.json.JsonSlurper
import spock.lang.Specification

class VisitorPatternExerciseSpec extends Specification {
    def exercise = new VisitorPatternExercise(
            [
                    new Book('Clean Code', '9780136083238', 2500),
                    new Chocolate('Snickers', 90, 15, 350),
                    new Book('Test Driven Development', '9780321146533', 3700),
                    new Computer('Apple', 'Mac Book', 98000, 1)
            ]
    )

    def 'should print contents as json'() {
        given:
            def slurper = new JsonSlurper()
        when:
            def json = slurper.parseText(exercise.asJson())
        then:
            json[0].title == 'Clean Code'
            json[0].isbn == '9780136083238'
            json[0].price == 2500
    }

    def 'should print contents as xml'() {
        given:
            def slurper = new XmlSlurper()
        when:
            def xml = slurper.parseText(exercise.asXml())
        then:
            xml[0].title == 'Clean Code'
            xml[0].isbn == '9780136083238'
            xml[0].price == 2500
    }
}
