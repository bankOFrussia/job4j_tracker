package ru.job4j.tracker;

public class ShowAction implements UserAction {
    private final Output output;

    public ShowAction(Output output) {
        this.output = output;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Show all items ===");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                output.println(item);
            }
        } else {
            output.println("Хранилище ещё не содержит заявок");
        }
        return true;
    }
}
