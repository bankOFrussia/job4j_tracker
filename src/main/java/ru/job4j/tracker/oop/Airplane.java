package ru.job4j.tracker.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолёт полетел.");
    }

    @Override
    public int checkPassengers() {
        System.out.println("На борту самолета 200 пассажиров.");
        return 0;
    }
}
