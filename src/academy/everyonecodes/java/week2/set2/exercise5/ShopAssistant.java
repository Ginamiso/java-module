package academy.everyonecodes.java.week2.set2.exercise5;

import java.util.ArrayList;
import java.util.List;

public class ShopAssistant {
    public void findShoeForCustomer(ShoeCustomer customer) {
        List<Shoe> availableShoes = new ArrayList<>();
        Shoe pink = new Shoe(39, "pink");
        Shoe red = new Shoe(40, "red");
        Shoe blue = new Shoe(38, "blue");
        Shoe black = new Shoe(42, "black");
        availableShoes.add(pink);
        availableShoes.add(red);
        availableShoes.add(blue);
        availableShoes.add(black);
        for (Shoe shoe : availableShoes) {
            if (customer.tryShoe(shoe)) {
                System.out.println("I will take the " + shoe.getColor() + " one!");
            } else {
                System.out.println("Nope, this one doesn't fit sorry!");
            }

        }
    }
}