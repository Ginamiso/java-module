package academy.everyonecodes.java.week4.set2.exercise3;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class DoubleListMedianCalculatorTest {
    DoubleListMedianCalculator doubleListMedianCalculator = new DoubleListMedianCalculator();

    @Test
    void calculate(){
        List<Double> input = List.of(2.5,1.7,5.8,3.0);
        double expected = 2.75;
        double result = doubleListMedianCalculator.calculate(input);

        Assertions.assertEquals(expected, result);

    }
    @Test
    void calculate2(){
        List<Double> input = List.of(1.4,5.7,4.8,5.2,7.6);
        double expected = 5.2;
        double result = doubleListMedianCalculator.calculate(input);

        Assertions.assertEquals(expected, result);

    }
    @Test
    void calculate3() {
        List<Double> input = List.of();
        double expected = -1;
        double result = doubleListMedianCalculator.calculate(input);

        Assertions.assertEquals(expected, result);


    }
}
