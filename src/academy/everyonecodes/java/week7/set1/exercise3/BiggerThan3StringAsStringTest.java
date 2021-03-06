package academy.everyonecodes.java.week7.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiggerThan3StringAsStringTest {
    @Test
    void test(){

        List<String> result = Stream.of(0,1,2,3,4,5)
                .filter(number -> number > 3)
                .map(String::valueOf)
                .collect(Collectors.toList());

        List<String> expected = List.of("4","5");
        Assertions.assertEquals(expected, result);
    }
}
