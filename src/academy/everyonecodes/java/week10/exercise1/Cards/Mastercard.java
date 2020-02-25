package academy.everyonecodes.java.week10.exercise1.Cards;


import java.util.List;

public class Mastercard extends CreditCard {
    private List<String> beginnings = List.of("51", "52", "53", "54", "55", "22");

    protected Mastercard() {
        super("Mastercard");
    }

    @Override
    public boolean isValidType(long creditCardNumber) {
        String numberAsString = String.valueOf(creditCardNumber);
        String beginning = numberAsString.substring(0, 2);
        int length = numberAsString.length();
        boolean isRightLength = length == 16;
        return isRightLength && beginnings.contains(beginning);


    }
}



