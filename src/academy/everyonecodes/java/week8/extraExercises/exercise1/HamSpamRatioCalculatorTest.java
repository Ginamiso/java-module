package academy.everyonecodes.java.week8.extraExercises.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HamSpamRatioCalculatorTest {
    HamSpamRatioCalculator calculator = new HamSpamRatioCalculator();
    @Test
    void calculate(){
        String expected = "ham 86% spam 13%";
        String result = calculator.calculate();
        System.out.println(result);
        Assertions.assertEquals(expected, result);
    }
}
