package academy.everyonecodes.java.week5.reflection.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class LinesCalculatorTest {
    LinesCalculator linesCalculator = new LinesCalculator();

    @Test
    void calculate() {
        String input = "1;2;3;4";
        List<String> expected = List.of("10");
        List<String> result = linesCalculator.calculate(input);


        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateNegatives() {
        String input = "-1;4;0";
        List<String> expected = List.of("3");
        List<String> result = linesCalculator.calculate(input);


        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateReturnsEmpty() {
        String input = "";
        List<String> expected = List.of();
        List<String> result = linesCalculator.calculate(input);


        Assertions.assertEquals(expected, result);
    }
}
