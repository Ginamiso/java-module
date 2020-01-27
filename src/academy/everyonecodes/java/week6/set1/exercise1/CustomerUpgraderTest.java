package academy.everyonecodes.java.week6.set1.exercise1;

import academy.everyonecodes.java.week6.set1.exercise1.Customer;
import academy.everyonecodes.java.week6.set1.exercise1.CustomerUpgrader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerUpgraderTest {

    CustomerUpgrader customerUpgrader = new CustomerUpgrader();

    @Test
    void upgradeToBusinessClass(){
        Customer input = new Customer("jake", "economy");
        Customer result = customerUpgrader.upgrade(input);

        Customer expected = new Customer("jake", "business");


        Assertions.assertEquals(expected.getCustomerClass(), result.getCustomerClass());

    }
    @Test
    void upgradeToBusinessClassCornerCase(){
        Customer input = new Customer("jake", "business");
        Customer result = customerUpgrader.upgrade(input);

        Customer expected = new Customer("jake", "business");


        Assertions.assertEquals(expected.getCustomerClass(), result.getCustomerClass());

    }
}
