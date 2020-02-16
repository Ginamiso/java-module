package academy.everyonecodes.java.optionals.enums.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopAssistant {
    private Shop shop;

    public ShopAssistant(Shop shop) {
        this.shop = shop;
    }

    private Size askForSize() {
        System.out.println("What size do you have?");
        Scanner scanner = new Scanner(System.in);
        String size = scanner.nextLine();
        return Size.valueOf(size);

    }

    private List<TShirt> findShirtsThatFit(Size size) {
        List<TShirt> sameSizeTShirts = new ArrayList<>();
        for (TShirt tShirt : shop.getAvailableTShirts()) {
            if (tShirt.getSize() == size) {
                sameSizeTShirts.add(tShirt);
            }
        }
        return sameSizeTShirts;

    }

    public void dealWithCustomer() {
        System.out.println("Welcome to everyone shops!");
        Size size = askForSize();
        List<TShirt> sameSizeTShirts = findShirtsThatFit(size);
        if (sameSizeTShirts.size() == 0) {
            System.out.println("I'm sorry, we have no shirts available for your size.");
        }
        for (TShirt tShirt : sameSizeTShirts) {
            System.out.println("We have a " + tShirt.getColor() + " shirt for " + tShirt.getPrice() + " euro.");
        }
    }
}
