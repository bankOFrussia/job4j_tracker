package ru.job4j.tracker.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Поезд отправился.");
    }

    @Override
    public int checkPassengers() {
        System.out.println("В поезде 555 человек.");
        return 0;
    }
}
