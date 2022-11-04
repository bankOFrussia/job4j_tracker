package ru.job4j.tracker;

import ru.job4j.tracker.strategy.*;

public class StartUI {

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int i = 0; i < actions.length; i++) {
            System.out.println(i + ". " + actions[i].name());
        }
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ShowAction(),
                new EditAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new DeleteAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}