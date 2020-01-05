package academy.everyonecodes.java.christmas.exercise10;

import java.util.Scanner;

public class AgeAsker {
    public boolean isAdult(){
        System.out.println("Are you 18 or older?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        return age >= 18;
    }
}
