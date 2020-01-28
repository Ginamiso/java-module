package academy.everyonecodes.java.week6.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class DoubleRightShifterTest {
    DoubleRightShifter doubleRightShifter = new DoubleRightShifter();

    @Test
    void shiftTwo(){
        List<Double> numbers = List.of(2.0,3.1,4.5);
        List<Double> expected = List.of(3.1,4.5,2.0);

        List<Double> result = doubleRightShifter.shiftTwo(numbers);

        Assertions.assertEquals(expected, result);
    }
    @Test
    void shiftTwoOneEntryList(){
        List<Double> numbers = List.of(2.0);
        List<Double> expected = List.of(2.0);

        List<Double> result = doubleRightShifter.shiftTwo(numbers);

        Assertions.assertEquals(expected, result);
    }
}
