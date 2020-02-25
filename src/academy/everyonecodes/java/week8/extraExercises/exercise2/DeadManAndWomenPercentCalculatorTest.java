package academy.everyonecodes.java.week8.extraExercises.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeadManAndWomenPercentCalculatorTest {
    DeadManAndWomenPercentCalculator calculator = new DeadManAndWomenPercentCalculator();

    @Test
    void calculate() {
        String result = calculator.calculate();
        String expected = "Dead men: 88% Dead Women: 11%";
        Assertions.assertEquals(expected, result);
    }
}