package academy.everyonecodes.java.week6.set1.exercise2;

import academy.everyonecodes.java.week6.set1.exercise1.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ScreenNameFormatterTest {
    ScreenNameFormatter screenNameFormatter = new ScreenNameFormatter();

    @ParameterizedTest
    @CsvSource({
            "JACK, Jack, business",
            "paul, Paul, economy",
            "gina, GINA, nothing"
    })
    void formatName(String expected, String name, String customerClass) {
        Customer input = new Customer(name, customerClass);
        String result = screenNameFormatter.format(input);

        Assertions.assertEquals(expected, result);
    }

}