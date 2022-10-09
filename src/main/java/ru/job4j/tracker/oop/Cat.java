package ru.job4j.tracker.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println("Кот ел: " + this.food + " Имя кота: " + this.name);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public String sound() {
        return "may-may";
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat gav = new Cat();
        Cat black = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Gavrick");
        gav.show();
        black.eat("fish");
        black.giveNick("Dark");
        black.show();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);

    }
}
