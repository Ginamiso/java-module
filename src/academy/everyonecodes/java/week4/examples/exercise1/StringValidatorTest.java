package academy.everyonecodes.java.week4.examples.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringValidatorTest {
    StringValidator stringValidator = new StringValidator();

    @ParameterizedTest
    @CsvSource({
            "true, casa",
            "false, ' '",
            "false, mam ma"
    })
    void validate(boolean expected, String input){
        boolean result = stringValidator.validate(input);

        Assertions.assertEquals(expected, result);
    }
}
