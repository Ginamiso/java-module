package academy.everyonecodes.java.week3.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PoundToEuroConverterTest {
    PoundToEuroConverter poundToEuroConverter = new PoundToEuroConverter();

    @ParameterizedTest
    @CsvSource({
            "1.7,2",
            "8.5,10 ",
            "0,0"
    })
    void convert(double expected, double input) {
        double result = poundToEuroConverter.convert(input);

        Assertions.assertEquals(expected, result);

    }
}
