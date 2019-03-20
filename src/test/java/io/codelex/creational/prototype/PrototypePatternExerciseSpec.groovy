package io.codelex.creational.prototype

import spock.lang.Specification

class PrototypePatternExerciseSpec extends Specification {
    def exercise = new PrototypePatternExercise()

    def 'should be able to copy house'() {
        given:
            def prototype = exercise.prototype
        when:
            def result = exercise.copy(prototype)
        then:
            !prototype.is(result)
            !prototype.roof.is(result.roof)
            prototype.doors.every { Door pDoor ->
                result.doors.every { Door rDoor ->
                    !pDoor.is(rDoor)
                }
            }
            prototype.windows.every { Window pWindow ->
                result.windows.every { Window rWindow ->
                    !pWindow.is(rWindow)
                }
            }
        and:
            prototype.roof.type == result.roof.type
        and:
            prototype.doors.every { Door pDoor ->
                result.doors.any { Door rDoor ->
                    pDoor.type == rDoor.type &&
                            pDoor.height == rDoor.height &&
                            pDoor.height == rDoor.height
                }
            }
        and:
            prototype.windows.every { Window pWindow ->
                result.windows.any { Window rWindow ->
                    pWindow.height == rWindow.height &&
                            pWindow.width == rWindow.width
                }
            }
    }
}
