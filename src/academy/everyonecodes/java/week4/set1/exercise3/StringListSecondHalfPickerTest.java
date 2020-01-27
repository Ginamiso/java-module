package academy.everyonecodes.java.week4.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;

class StringListSecondHalfPickerTest {
    StringListSecondHalfPicker stringListSecondHalfPicker = new StringListSecondHalfPicker();

    @RepeatedTest(10)
    void pick(){
        List<String> input = List.of("ciao", "mammamia", "lista","holidays","hawaii");
        String result = stringListSecondHalfPicker.pick(input);
        System.out.println(result);
        List<String> expectedPossibilities = List.of("lista","holidays","hawaii");

        Assertions.assertTrue(expectedPossibilities.contains(result), result);
    }
    @Test
    void pick2(){
        List<String> input = List.of("ciao", "mammamia", "lista","holidays");
        String result = stringListSecondHalfPicker.pick(input);
        List<String> expectedPossibilities = List.of("lista","holidays");

        Assertions.assertTrue(expectedPossibilities.contains(result), result);
    }
    @Test
    void pickReturnsSingleEntryForListThatContainsOneElement() {
        List<String> strings = List.of("single");

        String result = stringListSecondHalfPicker.pick(strings);

        String expected = "single";
        Assertions.assertEquals(expected, result);
    }

}
