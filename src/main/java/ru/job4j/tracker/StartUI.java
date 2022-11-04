package ru.job4j.tracker;

import ru.job4j.tracker.strategy.CreateAction;

public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
    }

    public static void showItems(Tracker tracker) {
    }

    public static void editItem(Input input, Tracker tracker) {
    }

    public static void deleteItem(Input input, Tracker tracker) {
    }

    public static void findById(Input input, Tracker tracker) {
    }

    public static void findByName(Input input, Tracker tracker) {
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}