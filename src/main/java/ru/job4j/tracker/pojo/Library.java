package ru.job4j.tracker.pojo;

public class Library {
    public static void main(String[] args) {
        Book headFirstJava = new Book("Head First Java", 345);
        Book cleanCode = new Book("Clean Code", 555);
        Book effectiveJava = new Book("Effective Java", 666);
        Book JavaTheCompleteReference = new Book("Java - The Complete Reference", 1111);
        Book[] libra = new Book[4];
        libra[0] = headFirstJava;
        libra[1] = cleanCode;
        libra[2] = effectiveJava;
        libra[3] = JavaTheCompleteReference;
        for (int i = 0; i < libra.length; i++) {
            Book ex = libra[i];
            System.out.println("В книге " + ex.getName() + " " + ex.getCount() + " страниц");
        }
        System.out.println("Переставить местами 0 и 3");
        Book empty = libra[0];
        libra[0] = libra[3];
        libra[3] = empty;
        for (int i = 0; i < libra.length; i++) {
            Book ex = libra[i];
            System.out.println("В книге " + ex.getName() + " " + ex.getCount() + " страниц");
        }
        System.out.println("Цикл с именем Clean Code");
        for (int i = 0; i < libra.length; i++) {
            if (libra[i].getName().equals("Clean Code")) {
                System.out.println("Книга " + libra[i].getName() + " имеет индекс " + i);
            }
        }
    }
}
