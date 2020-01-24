package academy.everyonecodes.java.week5.reflection.exercise2;

import academy.everyonecodes.java.week5.set2.exercise7.IntegerListToStringListConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class IntegerListSumCalculatorTest {

    IntegerListSumCalculator sumCalculator = new IntegerListSumCalculator();

    @Test
    void sum() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int expected = 15;
        Optional<Integer> oResult = sumCalculator.sum(numbers);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());

    }

    @Test
    void sumReturnsOptionalEmpty() {
        List<Integer> numbers = List.of();
        Optional<Integer> oResult = sumCalculator.sum(numbers);

        Assertions.assertTrue(oResult.isEmpty());


    }

    @Test
    void sumNegativeNumbers() {
        List<Integer> numbers = List.of(-1, -2, -3, -4, -5);
        int expected = -15;
        Optional<Integer> oResult = sumCalculator.sum(numbers);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());

    }
}
