package academy.everyonecodes.java.week4.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class StringListFirstHalfPickerTest {

    StringListFirstHalfPicker stringListFirstHalfPicker = new StringListFirstHalfPicker();

    @Test
    void pick(){

        List<String> input = List.of("ciao","miao", "cane","gatto", "bau");
        String result = stringListFirstHalfPicker.pick(input);
        List<String> expectedPossibilities = List.of("ciao", "miao");

        Assertions.assertTrue(expectedPossibilities.contains(result),result);

    }
    @Test
    void pick2(){

        List<String> input = List.of("ciao","miao", "cane","gatto");
        String result = stringListFirstHalfPicker.pick(input);
        List<String> expectedPossibilities = List.of("ciao","miao");

        Assertions.assertTrue(expectedPossibilities.contains(result),result);

    }
    @Test
    void pick3(){

        List<String> input = List.of("ciao");
        String result = stringListFirstHalfPicker.pick(input);
        String expected = "ciao";

        Assertions.assertEquals(expected, result);
    }
}
