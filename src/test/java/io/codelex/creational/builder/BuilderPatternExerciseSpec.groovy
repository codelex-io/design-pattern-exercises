package io.codelex.creational.builder

import spock.lang.Specification

import static io.codelex.creational.builder.AudioSystem.CHIRPING_AUDIO_SYSTEM
import static io.codelex.creational.builder.AudioSystem.HIGH_END_AUDIO_SYSTEM
import static io.codelex.creational.builder.Chassis.*
import static io.codelex.creational.builder.Engine.Type.*
import static io.codelex.creational.builder.Gearbox.Type.AUTOMATIC
import static io.codelex.creational.builder.Gearbox.Type.MANUAL
import static io.codelex.creational.builder.Seat.Type.LEATHER
import static io.codelex.creational.builder.Seat.Type.RAG
import static io.codelex.creational.builder.SteeringSystem.POWER_STERING
import static io.codelex.creational.builder.SteeringSystem.RACK_AND_PINON
import static io.codelex.creational.builder.Wheel.Season.SUMMER
import static io.codelex.creational.builder.Wheel.Season.WINTER

class BuilderPatternExerciseSpec extends Specification {
    def exercise = new BuilderPatternExercise()

    def 'should create car #1'() {
        when:
            def car = exercise.firstCar()
        then:
            car.engine.type == PETROL
            car.engine.horsePower == 560
        and:
            car.gearbox.type == AUTOMATIC
            car.gearbox.gears == 7
        and:
            car.seats.size() == 4
            car.seats.every { Seat seat ->
                seat.type == LEATHER &&
                        seat.electric &&
                        seat.heated &&
                        !seat.sport
            }
        and:
            car.audioSystem == HIGH_END_AUDIO_SYSTEM
        and:
            car.chassis == SEDAN
        and:
            car.wheels.size() == 4
            car.wheels.each { Wheel wheel ->
                assert wheel.season == SUMMER
                assert wheel.rimSize == 20
            }
        and:
            car.steeringSystem == POWER_STERING
    }

    def 'should create car #2'() {
        when:
            def car = exercise.secondCar()
        then:
            car.engine.type == ELECTRICAL
            car.engine.horsePower == 480
        and:
            car.gearbox.type == AUTOMATIC
            car.gearbox.gears == 8
        and:
            car.seats.size() == 2
            car.seats.every { Seat seat ->
                seat.type == LEATHER &&
                        seat.electric &&
                        seat.heated &&
                        seat.sport
            }
        and:
            car.audioSystem == HIGH_END_AUDIO_SYSTEM
        and:
            car.chassis == COUPE
        and:
            car.wheels.size() == 4
            car.wheels.each { Wheel wheel ->
                assert wheel.season == SUMMER
                assert wheel.rimSize == 21
            }
        and:
            car.steeringSystem == POWER_STERING
    }

    def 'should create car #3'() {
        when:
            def car = exercise.thirdCar()
        then:
            car.engine.type == DIESEL
            car.engine.horsePower == 120
        and:
            car.gearbox.type == MANUAL
            car.gearbox.gears == 5
        and:
            car.seats.size() == 4
            car.seats.every { Seat seat ->
                seat.type == RAG &&
                        !seat.electric &&
                        !seat.heated &&
                        !seat.sport
            }
        and:
            car.audioSystem == CHIRPING_AUDIO_SYSTEM
        and:
            car.chassis == HATCHBACK
        and:
            car.wheels.size() == 4
            car.wheels.every { Wheel wheel ->
                wheel.season == WINTER && wheel.rimSize == 15
            }
        and:
            car.steeringSystem == RACK_AND_PINON
    }
}
