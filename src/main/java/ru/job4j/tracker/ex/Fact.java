package ru.job4j.tracker.ex;

public class Fact {
    public int calc(int n) {
        int rsl = 1;
        for (int i = 2; i <= n; i++) {
            rsl *= i;
        }
        return rsl;
    }

    public static void main(String[] args) {
        new Fact().calc(-1);
    }
}
