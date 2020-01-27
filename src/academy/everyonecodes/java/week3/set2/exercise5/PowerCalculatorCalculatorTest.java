package academy.everyonecodes.java.week3.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PowerCalculatorCalculatorTest {

    PowerCalculator powerCalculator = new PowerCalculator();

    @ParameterizedTest
    @CsvSource({
            "-125,-5,3",
            "0,0,0",
            "9,3,2",
            "1,2,0",
            "0.25, 2, -2",
            "0.25, -2,-2",
            "0, 0, 4"
    })
    void calculate(double expected, double input, int input2) {
        double result = PowerCalculator.calculate(input, input2);

        Assertions.assertEquals(expected, result);

    }


}
