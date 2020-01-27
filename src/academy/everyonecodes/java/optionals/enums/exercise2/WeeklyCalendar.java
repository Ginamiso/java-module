package academy.everyonecodes.java.optionals.enums.exercise2;

import java.time.DayOfWeek;
import java.util.Scanner;

public class WeeklyCalendar {

    public DayOfWeek askForDayOfWeek(){
        System.out.println("What day of the week is it?");
        Scanner scanner = new Scanner(System.in);
        int currentDay = scanner.nextInt();
        return DayOfWeek.of(currentDay);
    }
}
