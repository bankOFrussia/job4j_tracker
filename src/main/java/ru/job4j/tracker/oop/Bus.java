package ru.job4j.tracker.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Автобус поехал.");
    }

    @Override
    public int checkPassengers() {
        System.out.println("В автобусе 33 человека.");
        return 0;
    }
}
