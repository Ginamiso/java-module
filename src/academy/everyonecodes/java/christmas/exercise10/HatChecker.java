package academy.everyonecodes.java.christmas.exercise10;

import java.util.Scanner;

public class HatChecker {
    public boolean isWearingAHat(){
        System.out.println("Are you wearing a hat?");
        Scanner scanner = new Scanner(System.in);
        boolean hat =scanner.nextBoolean();
        return hat;
    }
}
