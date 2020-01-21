package academy.everyonecodes.java.week5.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class DoubleListMaximumFinderTest {
    DoubleListMaximumFinder doubleMaxFinder = new DoubleListMaximumFinder();

    @Test
    void find() {
        List<Double> input = List.of(3.0, 4.5, 7.1, 3.7);
        Optional<Double> oResult = doubleMaxFinder.find(input);
        Assertions.assertTrue(oResult.isPresent());

        Assertions.assertEquals(7.1, oResult.get());
    }

    @Test
    void find2() {
        List<Double> input = List.of();
        Optional<Double> oResult = doubleMaxFinder.find(input);

        Assertions.assertTrue(oResult.isEmpty());
    }

    @Test
    void find3() {
        List<Double> input = List.of(4.5, 10.5, 5.4, 7.9);

        Optional<Double> oResult = doubleMaxFinder.find(input);
        Assertions.assertTrue(oResult.isPresent());

        Assertions.assertEquals(10.5, oResult.get());
    }
}
