package academy.everyonecodes.java.week3.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommuteTimeCalculatorTest {

    CommuteTimeCalculator commuteTimeCalculator = new CommuteTimeCalculator();

    @Test
    void calculateWalkingTime() {
        double input = 2.5;

        double result = commuteTimeCalculator.calculateWalkingTime(input);

        double expected = 37.5;

        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateTramTime() {

        int input = 5;

        double result = commuteTimeCalculator.calculateTramTime(input);

        int expected = 20;

        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateTotalTime() {
        int input1 = 5;
        double input2 = 2.5;
        double input3 = 1.3;

        double result = commuteTimeCalculator.calculateTotalTime(input1, input2, input3);
        int expected = 77;
        Assertions.assertEquals(expected, result);
    }
}