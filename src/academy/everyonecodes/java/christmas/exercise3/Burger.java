package academy.everyonecodes.java.christmas.exercise3;
import java.util.Scanner;
public class Burger {
    public static void main(String[] args) {
        double bigGearBurger = 6.5;
        double mcButtonsLongBurger = 7.20;
        double veggieCircuitsBurger = 5.7;
        double frenchFries = 2.5;
        double finalPrice = 0.0;
        System.out.println("Good day! What burger do you want?");
        Scanner scanner = new Scanner(System.in);
        String burger = scanner.nextLine().toLowerCase();
        if(burger.equals("big gear burger")){
            finalPrice = finalPrice + bigGearBurger;
        }
        if(burger.equals("mc buttons long burger")){
            finalPrice = finalPrice + mcButtonsLongBurger;
        }
        if(burger.equals("veggie circuits burger")){
            finalPrice = finalPrice + veggieCircuitsBurger;
        }
        System.out.println("Do you want french fries with that?");
        boolean wantsFries = scanner.nextBoolean();
        if (wantsFries){
            finalPrice = finalPrice + frenchFries;
        }
        System.out.println("It's "+finalPrice+" Euro, please.");
    }
}
