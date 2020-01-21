package academy.everyonecodes.java.week5.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class DoubleListMinimumFinderTest {
    DoubleListMinimumFinder doubleMinFinder = new DoubleListMinimumFinder();

    @Test
    void find() {
        List<Double> input = List.of(3.5, 7.1, 5.7, 4.9, 9.7);
        Optional<Double> oResult = doubleMinFinder.find(input);
        Assertions.assertTrue(oResult.isPresent());

        Assertions.assertEquals(3.5, oResult.get());

    }

    @Test
    void find2() {
        List<Double> input = List.of();
        Optional<Double> oResult = doubleMinFinder.find(input);

        Assertions.assertTrue(oResult.isEmpty());

    }

    @Test
    void find3() {
        List<Double> input = List.of(6.7, 5.7, 8.3, 44.7, 88.1);
        Optional<Double> oResult = doubleMinFinder.find(input);
        Assertions.assertTrue(oResult.isPresent());


        Assertions.assertEquals(5.7, oResult.get());
    }
}
