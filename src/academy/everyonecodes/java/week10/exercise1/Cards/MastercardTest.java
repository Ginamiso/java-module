package academy.everyonecodes.java.week10.exercise1.Cards;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MastercardTest {

    Mastercard mastercard = new Mastercard();

    @ParameterizedTest
    @CsvSource({
            "true, 2221000000000009",
            "false, 4012888888881881",
            "false, 6011000990139424"
    })
    void isValidType(boolean expected, long input) {
        boolean result = mastercard.isValidType(input);
        Assertions.assertEquals(expected, result);
    }
}