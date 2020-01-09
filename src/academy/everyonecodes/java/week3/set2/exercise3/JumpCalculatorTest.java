package academy.everyonecodes.java.week3.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class JumpCalculatorTest {
    JumpCalculator jumpCalculator = new JumpCalculator();

    @ParameterizedTest
    @CsvSource({
            "6, 1",
            "0,0"
    })
    void calculateJumps(int expected, int input){
        int result = jumpCalculator.calculateJumps(input);
        Assertions.assertEquals(expected, result);
    }
}
