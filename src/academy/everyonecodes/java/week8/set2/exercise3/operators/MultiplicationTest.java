package academy.everyonecodes.java.week8.set2.exercise3.operators;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



class MultiplicationTest {

    Multiplication multiplication = new Multiplication();

    @ParameterizedTest
    @CsvSource({
            "0,0,0",
            "1,1,1",
            "1,-1,-1"
    })
    void operate(double expected, double number1, double number2) {
        double result = multiplication.operate(number1,number2);

        Assertions.assertEquals(expected, result);
    }
}