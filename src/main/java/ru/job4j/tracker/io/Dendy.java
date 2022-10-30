package ru.job4j.tracker.io;

import java.util.Scanner;

public class Dendy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Игры.");
            System.out.println("1. Танчики");
            System.out.println("2. Супер Марио");
            System.out.println("3. Выйти");
            System.out.println("Введите пункт меню, чтобы начать игру: ");
            int selected = Integer.parseInt(input.nextLine());
            if (selected == 3) {
                System.out.println("Игра завершена.");
                run = false;
            } else if (selected == 1) {
                System.out.println("Танчики загружаются ... ");
            } else if (selected == 2) {
                System.out.println("Супер Марио загружается ...");
            } else {
                System.out.println("Такой игры нет.");
            }
            System.out.println();
        }
    }
}
