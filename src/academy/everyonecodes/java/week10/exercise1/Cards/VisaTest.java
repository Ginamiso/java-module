package academy.everyonecodes.java.week10.exercise1.Cards;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class VisaTest {

    Visa visa = new Visa();

    @ParameterizedTest
    @CsvSource({
            "true, 4012888888881881",
            "true, 4222222222222",
            "false, 5105105105105100"
    })
    void isValidType(boolean expected, long input) {
        boolean result = visa.isValidType(input);

        Assertions.assertEquals(expected, result);
    }
}