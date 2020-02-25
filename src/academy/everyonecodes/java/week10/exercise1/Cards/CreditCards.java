package academy.everyonecodes.java.week10.exercise1.Cards;

import java.util.List;

public class CreditCards {

    private static List<CreditCard> cards = List.of(new AmericanExpress(), new Mastercard(), new Visa());

    public static List<CreditCard> get() {
        return cards;
    }
}
