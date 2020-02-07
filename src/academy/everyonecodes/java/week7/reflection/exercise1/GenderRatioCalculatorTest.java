package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GenderRatioCalculatorTest {
    GenderRatioCalculator calculator = new GenderRatioCalculator();
    @Test
    void calculateRatio(){
        String expected = "518:482";
        String result = calculator.calculate();

        Assertions.assertEquals(expected, result);
    }
}
