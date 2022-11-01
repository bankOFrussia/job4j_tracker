package ru.job4j.tracker.poly;

public interface Transport {
    void go();

    void passengers(int number);

    double getFuel(double amount);
}
