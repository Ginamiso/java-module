package academy.everyonecodes.java.week6.set1.exercise2;

import academy.everyonecodes.java.week6.set1.exercise1.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScreenNameFormatterTest {
    ScreenNameFormatter screenNameFormatter = new ScreenNameFormatter();

    @Test
    void createBusinessClass() {
        Customer input = new Customer("Jacke", "business");
        String result = screenNameFormatter.create(input);

        String expected = "JACKE";

        Assertions.assertEquals(expected, result);
    }

    @Test
    void createEconomyClass() {
        Customer input = new Customer("Jacke", "economy");
        String result = screenNameFormatter.create(input);

        String expected = "jacke";

        Assertions.assertEquals(expected, result);
    }

    @Test
    void createCornerCase() {
        Customer input = new Customer("JACKE", "Economy");
        String result = screenNameFormatter.create(input);

        String expected = "jacke";

        Assertions.assertEquals(expected, result);
    }
}
