package academy.everyonecodes.java.week3.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DoubleCalculatorTest {

    DoubleCalculator doubleCalculator = new DoubleCalculator();

    @ParameterizedTest
    @CsvSource({
            "4.4,2.2,2.2",
            "-4.4,-2.2,-2.2",
            "0.4, 0.2,0.2"
    })
    void sumDouble(double expected, double input, double input1){
        double result = doubleCalculator.sumDouble(input, input1);
        Assertions.assertEquals(expected, result);
    }

}
