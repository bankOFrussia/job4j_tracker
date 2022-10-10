package ru.job4j.tracker.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int number) {
        return number - x;
    }

    public int divide(int number) {
        return number / x;
    }

    public int sumAllOperation(int number) {
        return sum(number) + multiply(number) + minus(number) + divide(number);
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
        Calculator calc = new Calculator();
        System.out.println(calc.multiply(5));
        System.out.println(minus(10));
        System.out.println(calc.divide(20));
        System.out.println(calc.sumAllOperation(15));
    }
}
