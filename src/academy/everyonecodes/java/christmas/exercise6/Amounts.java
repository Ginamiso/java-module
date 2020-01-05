package academy.everyonecodes.java.christmas.exercise6;

import java.util.List;

public class Amounts {
    private List<Payment> payments;
    private String name;

    public Amounts(List<Payment> payments, String name){
        this.payments = payments;
        this.name = name;
    }

    public List<Payment> getPayments() {
        return payments;
    }
}
