package io.codelex.creational.builder;

import java.util.List;

class Car {
    private Engine engine;
    private Gearbox gearbox;
    private List<Seat> seats;
    private AudioSystem audioSystem;
    private Chassis chassis;
    private List<Wheel> wheels;
    private SteeringSystem steeringSystem;

    public Car(Engine engine,
               Gearbox gearbox,
               List<Seat> seats,
               AudioSystem audioSystem,
               Chassis chassis,
               List<Wheel> wheels,
               SteeringSystem steeringSystem) {
        this.engine = engine;
        this.gearbox = gearbox;
        this.seats = seats;
        this.audioSystem = audioSystem;
        this.chassis = chassis;
        this.wheels = wheels;
        this.steeringSystem = steeringSystem;
    }

    public Engine getEngine() {
        return engine;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public AudioSystem getAudioSystem() {
        return audioSystem;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public SteeringSystem getSteeringSystem() {
        return steeringSystem;
    }
}
