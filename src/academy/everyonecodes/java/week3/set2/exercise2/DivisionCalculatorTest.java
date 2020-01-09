package academy.everyonecodes.java.week3.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DivisionCalculatorTest {
    DivisionCalculator divisionCalculator = new DivisionCalculator();

    @ParameterizedTest

    @CsvSource({
            "3, 7.2,2.4",
            "3.4615384615384612, 4.5,1.3",
            "0.6774193548387097, -2.1, -3.1"
    })
    void divide(double expected, double input, double input1){
        double result = divisionCalculator.divide(input, input1);

        Assertions.assertEquals(expected, result);
    }

}
