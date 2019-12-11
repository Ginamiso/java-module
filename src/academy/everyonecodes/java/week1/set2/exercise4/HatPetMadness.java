package academy.everyonecodes.java.week1.set2.exercise4;
import java.util.Scanner;
public class HatPetMadness {
    public static boolean isWearingAHat() {
        System.out.println("Are you wearing a hat?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();

    }

    public static boolean isBringingAPet() {
        System.out.println("Are you bringing a pet?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();
    }

    public static void main(String[] args) {
        if (!isWearingAHat() && !isBringingAPet()) {
            System.out.println("Welcome to our cinema, ho may I assist you?");
        } else {
            System.out.println("I am sorry but you are not allowed to enter!");
        }
    }
}
