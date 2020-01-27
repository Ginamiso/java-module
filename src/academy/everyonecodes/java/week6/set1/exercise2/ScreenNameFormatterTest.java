package academy.everyonecodes.java.week6.set1.exercise2;

import academy.everyonecodes.java.week6.set1.exercise1.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScreenNameFormatterTest {
    ScreenNameFormatter screenNameFormatter = new ScreenNameFormatter();

    @Test
    void createBusinessClass() {
        Customer input = new Customer("Jacke", "business");
        Customer result = screenNameFormatter.create(input);

        Customer expected = new Customer("JACKE", "business");

        Assertions.assertEquals(expected.getName(), result.getName());
    }

    @Test
    void createEconomyClass() {
        Customer input = new Customer("Jacke", "economy");
        Customer result = screenNameFormatter.create(input);

        Customer expected = new Customer("jacke", "economy");

        Assertions.assertEquals(expected.getName(), result.getName());
    }

    @Test
    void createCornerCase() {
        Customer input = new Customer("JACKE", "Economy");
        Customer result = screenNameFormatter.create(input);

        Customer expected = new Customer("jacke", "economy");

        Assertions.assertEquals(expected.getName(), result.getName());
    }
}
