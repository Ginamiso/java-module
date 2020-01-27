package academy.everyonecodes.java.week4.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LineSumCalculatorTest {
    LineSumCalculator lineSumCalculator = new LineSumCalculator();

    @Test
    void calculate(){
        String input = "11;22;33";
        int expected = 66;
        int result = lineSumCalculator.calculate(input);

        Assertions.assertEquals(expected,result);
    }
    @Test
    void calculate2(){
        String input = "-11;-22;-33";
        int expected = -66;
        int result = lineSumCalculator.calculate(input);

        Assertions.assertEquals(expected,result);
    }
    @Test
    void calculate3(){
        String input = "0";
        int expected = 0;
        int result = lineSumCalculator.calculate(input);

        Assertions.assertEquals(expected,result);
    }

}
