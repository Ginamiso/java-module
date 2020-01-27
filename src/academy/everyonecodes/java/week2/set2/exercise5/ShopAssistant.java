package academy.everyonecodes.java.week2.set2.exercise5;

import java.util.ArrayList;
import java.util.List;

public class ShopAssistant {
    public void findShoeForCustomer(ShoeCustomer customer) {

       List<Shoe> availableShoes = List.of(
               new Shoe(39, "pink"),
               new Shoe(40, "red"),
               new Shoe(38, "blue"),
               new Shoe(42, "black"));

        for (Shoe shoe : availableShoes) {
            if (customer.tryShoe(shoe)) {
                System.out.println("I will take the " + shoe.getColor() + " one!");
            }
            System.out.println("Nope, this one doesn't fit sorry!");

        }
    }
}