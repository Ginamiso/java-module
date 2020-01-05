package academy.everyonecodes.java.christmas.exercise6;

public class Payment {
    private String name;
    private int amount;

    public Payment(String name, int amount){
        this.name = name;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
