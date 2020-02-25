package academy.everyonecodes.java.week10.exercise1.Cards;

import java.util.List;

public class AmericanExpress extends CreditCard {

    private List<String> beginnings = List.of("34", "37");

    protected AmericanExpress() {
        super("American Express");
    }

    @Override
    public boolean isValidType(long creditCardNumber) {
        String ccNumber = String.valueOf(creditCardNumber);
        String beginning = ccNumber.substring(0, 2);
        return ccNumber.length() == 15 && beginnings.contains(beginning);
    }
}

