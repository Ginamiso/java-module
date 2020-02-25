package academy.everyonecodes.java.week7.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.stream.Stream;

public class RoundDownToAbsoluteBiggerThan1Test {
    @Test
    void test(){
        Stream<Double> doubles = Stream.of(1.5, -1.8, 3.5);
        Optional<Double> result = doubles.map(Math::floor)
                .map(Math::abs)
                .filter(number -> number >1)
                .findFirst();

        double expected = 2.0;

        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(expected, result.get());
    }
}
