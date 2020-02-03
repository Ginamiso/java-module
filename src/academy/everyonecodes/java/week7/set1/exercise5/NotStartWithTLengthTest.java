package academy.everyonecodes.java.week7.set1.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NotStartWithTLengthTest {
    @Test
    void test(){
        Stream<String> names = Stream.of("Hello", "there", "General", "Kenobi");

        List<Integer> result = names.filter(name -> !name.startsWith("t"))
                .map(name -> name.length())
                .collect(Collectors.toList());
        List<Integer> expected = List.of(5,7,6);

        Assertions.assertEquals(expected, result);

    }
}
