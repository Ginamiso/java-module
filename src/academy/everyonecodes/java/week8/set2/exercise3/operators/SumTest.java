package academy.everyonecodes.java.week8.set2.exercise3.operators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    Sum sum = new Sum();

    @ParameterizedTest
    @CsvSource({
            "0,0,0",
            "-2.0,-1.0,-1.0",
            "0,-1.0,1.0"
    })
    void operate(double expected, double number1, double number2) {
        double result = sum.operate(number1,number2);

        Assertions.assertEquals(expected,result);
    }
}