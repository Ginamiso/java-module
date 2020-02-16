package academy.everyonecodes.java.optionals.enums.exercise2;

import java.time.DayOfWeek;
import java.time.Month;

public class Application {
    public static void main(String[] args) {
        WeeklyCalendar weeklyCalendar = new WeeklyCalendar();
        DayOfWeek currentDay = weeklyCalendar.askForDayOfWeek();
        MonthlyCalendar monthlyCalendar = new MonthlyCalendar();
        Month currentMonth = monthlyCalendar.askForMonth();
        Drawer drawer = new Drawer();
        Outfit outfit = drawer.getOutfitForToday(currentMonth, currentDay);
        Mirror mirror = new Mirror();
        mirror.sayHowItLooks(currentDay, currentMonth, outfit);
    }
}
