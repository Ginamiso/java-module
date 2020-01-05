package academy.everyonecodes.java.christmas.exercise3b;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Burger bigGearBurger= new Burger("big gear burger", 6.5);
        Burger mcButtonsLongBurger = new Burger("mc buttons long burger", 7.2);
        Burger veggieCircuitBurger = new Burger("veggie circuit burger", 5.7);
        FrenchFries frenchFries = new FrenchFries("french fries", 2.5);
        double total = 0;
        System.out.println("Good day! What burger do you want?");
        Scanner scanner = new Scanner(System.in);
        String burger = scanner.nextLine().toLowerCase();
        if (burger.equals(bigGearBurger.getName())){
            total = total + bigGearBurger.getPrice();
        }
        if (burger.equals(mcButtonsLongBurger.getName())){
            total = total + mcButtonsLongBurger.getPrice();
        }
        if (burger.equals(veggieCircuitBurger.getName())){
            total = total + veggieCircuitBurger.getPrice();
        }
        System.out.println("Do you want french fries with that?");
        boolean wantsFries = scanner.nextBoolean();
        if (wantsFries){
            total = total + frenchFries.getPrice();
        }
        System.out.println("It's "+total+" Euro, please.");
    }
}
