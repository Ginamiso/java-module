package academy.everyonecodes.java.week5.set2.exercise7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class IntegerListToStringListConverterTest {
    IntegerListToStringListConverter integerListToStringListConverter = new IntegerListToStringListConverter();

    @Test
    void convert(){
        List<Integer> input = List.of(1,2,3,4);
        List<String> result = integerListToStringListConverter.convert(input);
        List<String> expected = List.of("1", "2", "3", "4");
        Assertions.assertEquals(expected, result);
    }



}
