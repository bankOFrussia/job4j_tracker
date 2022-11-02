package ru.job4j.tracker.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Поехали.");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Загрузили пассажиров.");
    }

    @Override
    public double getFuel(double fuelAmount) {
        System.out.println("Заправили топливо.");
        return 0;
    }
}
