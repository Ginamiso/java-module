package academy.everyonecodes.java.week10.exercise1.Cards;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AmericanExpressTest {

    AmericanExpress americanExpress = new AmericanExpress();

    @ParameterizedTest
    @CsvSource({
            "true, 378282246310005",
            "false, 30569309025904",
            "false, 2221000000000009"
    })
    void isValidType(boolean expected, long input) {
        boolean result = americanExpress.isValidType(input);

        Assertions.assertEquals(expected, result);
    }
}