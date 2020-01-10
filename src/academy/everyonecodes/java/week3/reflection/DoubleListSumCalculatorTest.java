package academy.everyonecodes.java.week3.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoubleListSumCalculatorTest {

    DoubleListSumCalculator doubleListSumCalculator = new DoubleListSumCalculator();

    @Test
    void calculate() {

        List<Double> input = List.of(2.5, 3.4, 6.3);

        double expected = 12.2;

        double result = doubleListSumCalculator.calculate(input);

        Assertions.assertEquals(expected, result);

    }
}