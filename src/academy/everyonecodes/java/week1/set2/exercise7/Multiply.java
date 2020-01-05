package academy.everyonecodes.java.week1.set2.exercise7;

import java.util.List;
import java.util.Scanner;

public class Multiply {
    public static void multiply(int number) {
        int result = 0;
        List<Integer> numbers = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        for (int factor : numbers) {
            result = number * factor;
            System.out.println(number + " X "+ factor + " = " + result);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say a number!");
        int number = scanner.nextInt();
        multiply(number);
    }

}
