package academy.everyonecodes.java.week10.exercise1;

import academy.everyonecodes.java.week10.exercise1.Cards.CreditCard;
import academy.everyonecodes.java.week10.exercise1.Cards.CreditCards;

import java.util.List;
import java.util.Optional;

public class Credit {

    private List<CreditCard> cards = CreditCards.get();

    public String evaluate(long number) {
        if (isValid(number)) {
            Optional<String> oName = cards.stream()
                    .filter(card -> card.isValidType(number))
                    .map(CreditCard::getName)
                    .findFirst();
            if (oName.isPresent()) {
                return oName.get();
            }
        }
        return "INVALID";
    }


    public boolean isValid(long creditCardNumber) {
        String numberAsString = String.valueOf(creditCardNumber);
        int sum = 0;
        boolean alternate = false;
        for (int i = numberAsString.length() - 1; i >= 0; i--) {
            int number = Integer.parseInt(numberAsString.substring(i, i + 1));
            if (alternate) {
                number *= 2;
                if (number > 9) {
                    number = (number % 10) + 1;
                }
            }
            sum += number;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }
}
