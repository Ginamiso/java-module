package academy.everyonecodes.java.week4.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringCapitalizerTest {
    StringCapitalizer stringCapitalizer = new StringCapitalizer();

    @ParameterizedTest
    @CsvSource({
            "Casa, casa",
            "'', ''",
            "Mano, Mano",
            "Mare, MARE"
    })
    void capitalize(String expected, String input){
        String result = stringCapitalizer.capitalize(input);

        Assertions.assertEquals(expected, result);
    }
}