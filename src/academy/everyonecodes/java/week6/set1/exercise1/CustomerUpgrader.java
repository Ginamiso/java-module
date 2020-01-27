package academy.everyonecodes.java.week6.set1.exercise1;

import academy.everyonecodes.java.week6.set1.exercise1.Customer;

import java.util.Scanner;

public class CustomerUpgrader {

    Scanner scanner = new Scanner(System.in);

    public Customer upgrade(Customer customer) {
        customer.setCustomerClass("business");
        return customer;
    }
}


