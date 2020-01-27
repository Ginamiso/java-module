package academy.everyonecodes.java.week4.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PngCheckerTest {
    PngChecker pngChecker = new PngChecker();

    @ParameterizedTest
    @CsvSource({
            "true, casa.png",
            "false, ''",
            "false, casa.jpg",
            "true, casa.PNG",
            "false, ci"
    })
    void check(boolean expected, String input){
        boolean result = pngChecker.check(input);

        Assertions.assertEquals(expected, result);
    }
}
