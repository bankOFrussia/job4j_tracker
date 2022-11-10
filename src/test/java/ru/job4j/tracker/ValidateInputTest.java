package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {

    @Test
     public void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenInputIsValid() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[]{"2"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(2);
    }

    @Test
    public void whenInputIsValid3Times() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "test", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        String test = input.askStr("Add new item");
        int selected1 = input.askInt("Show all items");
        assertThat(selected).isEqualTo(0);
        assertThat(test).isEqualTo("test");
        assertThat(selected1).isEqualTo(1);
    }

    @Test
    public void whenInputIsMinus1() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[]{"-1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-1);
    }
}