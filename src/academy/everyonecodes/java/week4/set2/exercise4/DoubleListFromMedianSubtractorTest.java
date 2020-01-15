package academy.everyonecodes.java.week4.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class DoubleListFromMedianSubtractorTest {
    DoubleListFromMedianSubtractor doubleListFromMedianSubtractor = new DoubleListFromMedianSubtractor();

    @Test
    void calculate(){
        List<Double> input = List.of(1.0,4.0,2.0,10.0,11.5);
        List<Double> expected = List.of(-3.0, 0.0, -2.0, 6.0, 7.5);
        List<Double> result = doubleListFromMedianSubtractor.calculate(input);

        Assertions.assertEquals(expected, result);
    }
    @Test
    void calculate2(){
        List<Double> input = List.of(2.8,1.7,6.5,9.3);
        List<Double> expected = List.of(-1.8500000000000005, -2.95, 1.8499999999999996, 4.65);
        List<Double> result = doubleListFromMedianSubtractor.calculate(input);

        Assertions.assertEquals(expected, result);
    }
    @Test
    void calculate3(){
        List<Double> input = List.of(3.0,4.0,7.4,10.0,2.5);
        List<Double> expected = List.of(-1.0, 0.0, 3.4000000000000004, 6.0, -1.5);
        List<Double> result = doubleListFromMedianSubtractor.calculate(input);

        Assertions.assertEquals(expected, result);
    }

}
