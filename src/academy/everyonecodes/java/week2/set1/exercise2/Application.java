package academy.everyonecodes.java.week2.set1.exercise2;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What color is the car?");
        String color = scanner.nextLine();
        System.out.println("In which year was the car built?");
        int year = scanner.nextInt();
        Car car1 = new Car(color, year);

    }
}
