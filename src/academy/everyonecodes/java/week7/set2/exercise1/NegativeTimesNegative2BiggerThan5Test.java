package academy.everyonecodes.java.week7.set2.exercise1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NegativeTimesNegative2BiggerThan5Test {
    @Test
    void tes(){
        List<Double> numbers = List.of(1.2, 0.4, -0.1, -2.0, -3.1, 2.0, -2.6);

        long result = numbers.stream()
                .filter(number -> number < 0)
                .map(number -> number*-2)
                .filter(number -> number >5)
                .count();

        long expected = 2;

        assertEquals(expected, result);

    }
}
