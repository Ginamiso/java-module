package academy.everyonecodes.java.week10.exercise1.Cards;

public abstract class CreditCard {

    private String name;

    protected CreditCard(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }


    public abstract boolean isValidType(long creditCardNumber);
}
