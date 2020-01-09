package academy.everyonecodes.java.week3.set2.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringStorageSizeCalculatorTest {

    StringStorageSizeCalculator stringStorageSizeCalculator = new StringStorageSizeCalculator();
    @ParameterizedTest
    @CsvSource({
            "96,cane",
            "112,fiore",
            "32,''"
    })
    void calculate(int expected, String word){
        int result = stringStorageSizeCalculator.calculate(word);
        Assertions.assertEquals(expected, result);
    }
}
