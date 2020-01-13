package academy.everyonecodes.java.week4.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StringListSecondHalfPickerTest {
    StringListSecondHalfPicker stringListSecondHalfPicker = new StringListSecondHalfPicker();

    @Test
    void pick(){
        List<String> input = List.of("ciao", "mammamia", "lista","holidays","hawaii");
        String result = stringListSecondHalfPicker.pick(input);
        System.out.println(result);

        Assertions.assertTrue(input.contains(result));
    }
}
