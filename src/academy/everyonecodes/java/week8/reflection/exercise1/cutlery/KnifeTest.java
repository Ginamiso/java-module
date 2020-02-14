package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class KnifeTest {
    Cutlery knife = new Knife();

    @Test
    void getName() {
        String result = knife.getName();
        String expected = "Knife";

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "true, Fish",
            "true, pizza",
            "false, ''"
    })
    void isUsedFor(boolean expected, String input) {
        boolean result = knife.isUsedFor(input);

        assertEquals(expected, result);
    }
}