package academy.everyonecodes.java.christmas.exercise5;
import java.util.Scanner;
public class RoboMentalist {
    public static void main(String[] args) {
        System.out.println("Say a number between 1 an 10");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while(number<1 || number >10){
            System.out.println("Say a number between 1 and 10");
            number = scanner.nextInt();
        }
        System.out.println("Alright! Let's perform a trick with that number.");
    }
}
