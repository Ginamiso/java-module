package academy.everyonecodes.java.week4.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MaxOrMinPickerTest {

    MaxOrMinPicker maxOrMinPicker = new MaxOrMinPicker();

    @Test
    void pick() {
        List<Integer> input = List.of(1, 3, 5, 4, 2);
        int result = maxOrMinPicker.pick(input);
        List<Integer> expected = List.of(1,2);

        Assertions.assertTrue(expected.contains(result));

    }


    @Test
    void pick2() {
        List<Integer> input = List.of(10,9,70,40,99);
        int result = maxOrMinPicker.pick(input);
        List<Integer> expected = List.of(9,99);


        Assertions.assertTrue(expected.contains(result));
    }
    @Test
    void pick3() {
        List<Integer> input = List.of(2);
        int result = maxOrMinPicker.pick(input);

        Assertions.assertEquals(2, result);
    }
}
