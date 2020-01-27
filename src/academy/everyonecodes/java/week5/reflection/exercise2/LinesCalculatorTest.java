package academy.everyonecodes.java.week5.reflection.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class LinesCalculatorTest {
    LinesCalculator linesCalculator = new LinesCalculator();

    @Test
    void calculate() {
        List<String> input = List.of("1;2;3;4", "-1;4;0");
        List<String> expected = List.of("10", "3");
        List<String> result = linesCalculator.calculate(input);


        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateNegatives() {
        List<String> input = List.of("-1;4;0");
        List<String> expected = List.of("3");
        List<String> result = linesCalculator.calculate(input);


        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateReturnsEmpty() {
        List<String> input = List.of();
        List<String> result = linesCalculator.calculate(input);


        Assertions.assertEquals(0, result.size());
    }
}
