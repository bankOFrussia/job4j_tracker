package ru.job4j.tracker.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово " + eng;
    }

    public static void main(String[] args) {
        DummyDic translater = new DummyDic();
        String word = translater.engToRus("Bullwinkle");
        System.out.println(word);
    }
}
