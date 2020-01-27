package academy.everyonecodes.java.week6.set1.exercise2;

import academy.everyonecodes.java.week6.set1.exercise1.Customer;

public class ScreenNameFormatter {

    public Customer create(Customer customer) {
        if (customer.getCustomerClass().equals("business")) {
            String name = customer.getName();
            customer.setName(name.toUpperCase());
            return customer;
        } else {
            String name = customer.getName();
            customer.setName(name.toLowerCase());
            return customer;
        }
    }
}
