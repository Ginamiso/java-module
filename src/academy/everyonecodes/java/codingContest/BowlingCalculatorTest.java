package academy.everyonecodes.java.codingContest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BowlingCalculatorTest {
    BowlingCalculator calculator = new BowlingCalculator();

    @ParameterizedTest
    @CsvSource({
            "'10:7,2,1,9,6,4,5,5,10,3,7,7,3,6,4,10,2,8,6'"
    })
    void result(String input) {
        String result = calculator.result(input);
    }
}