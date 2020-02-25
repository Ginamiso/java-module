package academy.everyonecodes.java.week10.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CreditTest {

    Credit credit = new Credit();

    @ParameterizedTest
    @CsvSource({
            "Mastercard, 2221000000000009",
            "Visa, 4111111111111111",
            "American Express, 378282246310005",
            "INVALID, 3566002020360505",
            "INVALID, 937622895005905930"
    })
    void evaluate(String expected, long input) {
        String result = credit.evaluate(input);

        Assertions.assertEquals(expected, result);
    }
}