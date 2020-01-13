package academy.everyonecodes.java.week4.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PngCheckerTest {
    PngChecker2 pngChecker2 = new PngChecker2();

    @ParameterizedTest
    @CsvSource({
            "true, casa.png",
            "false, ''",
            "false, casa.jpg",
            "true, casa.PNG"
    })
    void check(boolean expected, String input){
        boolean result = pngChecker2.check(input);

        Assertions.assertEquals(expected, result);
    }
}
