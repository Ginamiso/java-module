package academy.everyonecodes.java.christmas.exercise6;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        int total = 0;
        Payment hansel = new Payment("Hansel", 23);
        Payment derek = new Payment("Derek", 54);
        Payment matilda = new Payment("Matilda", 12);
        Payment mugatu = new Payment("Mugatu", 3);
        Payment gina = new Payment("Gina", 11);
        List<Payment> payments = List.of(hansel, derek, matilda, mugatu, gina);
        Amounts amounts = new Amounts(payments, "List of money");
        for(Payment payment : amounts.getPayments()){
            total = total + payment.getAmount();

        }
        System.out.println("The total amount is "+total+" Euro.");

        }
}
