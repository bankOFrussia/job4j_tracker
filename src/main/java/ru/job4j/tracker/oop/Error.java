package ru.job4j.tracker.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void getInfo() {
        System.out.println("Действие: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.getInfo();
        Error error101 = new Error(true, 101, "Произошёл сбой в серверной зоне.");
        error101.getInfo();

    }
}
