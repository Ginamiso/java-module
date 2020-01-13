package academy.everyonecodes.java.week4.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StringListFirstHalfPickerTest {

    StringListFirstHalfPicker stringListFirstHalfPicker = new StringListFirstHalfPicker();

    @Test
    void pick(){

        List<String> input = List.of("ciao","miao", "cane","gatto", "bau");
        String result = stringListFirstHalfPicker.pick(input);
        System.out.println(result);

        Assertions.assertTrue(input.contains(result));

    }
}
