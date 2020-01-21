package academy.everyonecodes.java.week5.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class IntegerListAverageCalculatorTest {
    IntegerListAverageCalculator averageCalculator = new IntegerListAverageCalculator();

    @Test
    void calculate(){
        List<Integer> input = List.of(1,4,7,5,3);
        Optional<Double> oResult = averageCalculator.calculate(input);
        double result = oResult.get();
        double expected = 4;

        Assertions.assertEquals(expected, result);

    }
    @Test
    void calculate2(){
        List<Integer> input = List.of();
        Optional<Double> oResult = averageCalculator.calculate(input);

        Assertions.assertTrue(oResult.isEmpty());

    }
    @Test
    void calculate3(){
        List<Integer> input = List.of(20,30,5,3);
        Optional<Double> oResult = averageCalculator.calculate(input);
        double result = oResult.get();
        double expected = 14.5;

        Assertions.assertEquals(expected, result);

    }
}
