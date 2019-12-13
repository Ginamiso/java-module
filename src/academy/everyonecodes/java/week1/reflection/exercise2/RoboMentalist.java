package academy.everyonecodes.java.week1.reflection.exercise2;
import java.util.Scanner;
public class RoboMentalist {
    public static void main(String[] args){
        int number = 0;
        while (number <1 || number > 10){
            System.out.println("Say a number from 1 to 10");
            Scanner scanner = new Scanner(System.in);
            int numb = scanner.nextInt();

        }System.out.println("Allright, let's perform a trick with" + number);
    }
}
