package academy.everyonecodes.java.week3.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PowerCalculatorTest {

    PowerCalculator powerCalculator = new PowerCalculator();

    @ParameterizedTest
    @CsvSource({
            "-125,-5,3",
            "256,256,1",
            "0,0,0",
            "9,3,2",
            "1,132,0"
    })
    void calculate(double expected, double input, int input2) {
        double result = PowerCalculator.calculate(input, input2);

        Assertions.assertEquals(expected, result);

    }


}
