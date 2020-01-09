package academy.everyonecodes.java.week3.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class IntCalculatorTest {

    IntCalculator intCalculator = new IntCalculator();

    @ParameterizedTest
    @CsvSource({
            "0,0,0",
            "4,2,2",
            "-4,-2,-2"
    })
    void intSum(int expected, int input, int input1){
        int result = intCalculator.calculate(input, input1);

        Assertions.assertEquals(expected, result);
    }
}
