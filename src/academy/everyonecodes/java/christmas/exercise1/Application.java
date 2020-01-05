package academy.everyonecodes.java.christmas.exercise1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("How many kilos do you want to loose?");
        Scanner scanner = new Scanner(System.in);
        double kilos = scanner.nextInt();
        System.out.println("How many months would you like to take?");
        double months = scanner.nextInt();
        Fitness fitness = new Fitness();
        double kilosPerMonths = fitness.calculateKilosPerMonths(kilos, months);
        System.out.println("You will have to loose "+kilosPerMonths+" kilos per month.");
    }

}
