package academy.everyonecodes.java.optionals.enums.exercise2;

import java.time.Month;
import java.util.Scanner;

public class MonthlyCalendar {
    public Month askForMonth(){
        System.out.println("What month is it?");
        Scanner scanner = new Scanner(System.in);
        int currentMonth = scanner.nextInt();
        return Month.of(currentMonth);

    }
}
