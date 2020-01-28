package academy.everyonecodes.java.week6.set1.exercise1;

import academy.everyonecodes.java.week6.set1.exercise1.Customer;
import academy.everyonecodes.java.week6.set1.exercise1.CustomerUpgrader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CustomerUpgraderTest {

    CustomerUpgrader customerUpgrader = new CustomerUpgrader();

    @ParameterizedTest
    @CsvSource({
            "business, Jake, economy",
            "business, Paul, business"
    })
    void upgrade(String expected, String name, String customerClass){

        Customer customer = new Customer(name, customerClass);
        customerUpgrader.upgrade(customer);

        Assertions.assertEquals(expected, customer.getCustomerClass());
    }
}
