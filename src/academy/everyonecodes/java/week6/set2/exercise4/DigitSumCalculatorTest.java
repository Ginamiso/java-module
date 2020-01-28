package academy.everyonecodes.java.week6.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DigitSumCalculatorTest {
    DigitSumCalculator digitSumCalculator = new DigitSumCalculator();

    @ParameterizedTest
    @CsvSource({
            "10, 1234",
            "2, 11",
            "0, 0",
    })
    void calculate(int expected, int input){
        int result = digitSumCalculator.calculate(input);

        Assertions.assertEquals(expected, result);
    }
}
