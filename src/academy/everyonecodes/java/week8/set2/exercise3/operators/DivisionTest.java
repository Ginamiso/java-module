package academy.everyonecodes.java.week8.set2.exercise3.operators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    Division division = new Division();

    @ParameterizedTest
    @CsvSource({
            "1,2.0,2.0",
            "1.0,1.0,1.0",
            "1.0,-1.0,-1.0"
    })
    void operate(double expected, double number1, double number2) {
        double result = division.operate(number1, number2);

        Assertions.assertEquals(expected, result);
    }
}