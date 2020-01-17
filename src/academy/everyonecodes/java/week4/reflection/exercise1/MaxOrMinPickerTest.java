package academy.everyonecodes.java.week4.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MaxOrMinPickerTest {

    MaxOrMinPicker maxOrMinPicker = new MaxOrMinPicker();

    @Test
    void pick() {
        List<Integer> input = List.of(1, 3, 5, 4, 2);
        int result = maxOrMinPicker.pick(input);
        int expected = 1;
        int expected2 = 5;

        Assertions.assertEquals(expected, result);
        Assertions.assertEquals(expected, result);
    }


    @Test
    void pick2() {
        List<Integer> input = List.of(10);
        int result = maxOrMinPicker.pick(input);
        int expected = 10;


        Assertions.assertEquals(expected, result);

    }
}
