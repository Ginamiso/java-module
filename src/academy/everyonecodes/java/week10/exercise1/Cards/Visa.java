package academy.everyonecodes.java.week10.exercise1.Cards;


public class Visa extends CreditCard {
    protected Visa() {
        super("Visa");
    }

    @Override
    public boolean isValidType(long creditCardNumber) {
        String numberAsString = String.valueOf(creditCardNumber);
        boolean isRightLength = numberAsString.length() == 13 || numberAsString.length() == 16;
        return numberAsString.startsWith("4") && isRightLength;
    }
}
