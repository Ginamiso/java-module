package academy.everyonecodes.java.evaluation1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class VowelCounterTest {
    VowelCounter counter = new VowelCounter();

    @ParameterizedTest
    @CsvSource({
            "2, casa",
            "0, prtzl",
            "0, ''",
            "1, u"
    })
    void count(int expected, String input){
        int result = counter.count(input);

        Assertions.assertEquals(expected, result);
    }
}
