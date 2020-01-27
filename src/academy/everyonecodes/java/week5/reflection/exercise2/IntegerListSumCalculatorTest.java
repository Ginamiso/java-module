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
        int oResult = sumCalculator.sum(numbers);


        Assertions.assertEquals(expected, oResult);

    }

    @Test
    void sumReturnsZero() {
        List<Integer> numbers = List.of();
        int expected = 0;
        int oResult = sumCalculator.sum(numbers);

        Assertions.assertEquals(expected, oResult);




    }

    @Test
    void sumNegativeNumbers() {
        List<Integer> numbers = List.of(-1, -2, -3, -4, -5);
        int expected = -15;
        int oResult = sumCalculator.sum(numbers);


        Assertions.assertEquals(expected, oResult);

    }
}
