package academy.everyonecodes.java.week1.set2.exercise1;

import java.util.Scanner;

public class TastyBites {
    public static int calculateJumps(int foodType) {
        return foodType * 6;
    }

    public static int calculateBarks(int foodType) {
        return foodType + 1;
    }

    public static void main(String[] args) {
        System.out.println("What food do I get today?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int jumps = calculateJumps(number);
        int barks = calculateBarks(number);
        System.out.println("I will jump " + jumps + " times and I will bark " + barks + " times!");
    }

}
