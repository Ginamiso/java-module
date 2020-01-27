package academy.everyonecodes.java.week3.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MilesToKilometerConverterTest {
    MilesToKilometerConverter milesToKilometerConverter = new MilesToKilometerConverter();

    @ParameterizedTest
    @CsvSource({
            "8.05,5",
            "0,0",
            "4.83,3"
    })
    void converter(double expected, double input) {
        double result = milesToKilometerConverter.convert(input);

        Assertions.assertEquals(expected, result);
    }
}
