package academy.everyonecodes.java.week3.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AbsoluteValueCalculatorTest {
    AbsoluteValueCalculator absoluteValueCalculator = new AbsoluteValueCalculator();

    @ParameterizedTest
    @CsvSource({
            "4.5, -4.5",
            "0,0",
            "5.4, 5.4"
    })
    void calculate(double expected, double input){
        double result = absoluteValueCalculator.calculate(input);

        Assertions.assertEquals(expected, result);


    }

}
