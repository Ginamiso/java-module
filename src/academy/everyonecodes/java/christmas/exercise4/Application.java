package academy.everyonecodes.java.christmas.exercise4;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        System.out.println("How many episodes have you watched?");
        Scanner scanner = new Scanner(System.in);
        int numberOfEpisodes = scanner.nextInt();
        StrangerStudents stranger = new StrangerStudents();
        int totalTime = stranger.getTotalTimeForFirstSeason(numberOfEpisodes);
        System.out.println("The total amount spent watching those episodes is " +totalTime+" minutes.");

    }
    }
