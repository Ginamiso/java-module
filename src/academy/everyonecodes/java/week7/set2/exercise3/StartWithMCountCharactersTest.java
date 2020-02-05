package academy.everyonecodes.java.week7.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class StartWithMCountCharactersTest {
    @Test
    void test(){
        List<String> names = List.of("Mary", "Joe", "Max", "Laura");

        Optional<Integer> result = names.stream()
                .filter(name -> name.startsWith("M"))
                .map(String::length)
                .reduce(Integer::sum);

        int expected = 7;

        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(expected, result.get());
    }
}
