package academy.everyonecodes.java.optionals.enums.exercise2;

import java.time.DayOfWeek;
import java.time.Month;

public class Application {
    public static void main(String[] args) {
        WeeklyCalendar weeklyCalendar = new WeeklyCalendar();
        DayOfWeek currentDay = weeklyCalendar.askForDayOfWeek();
        MonthlyCalendar monthlyCalendar = new MonthlyCalendar();
        Month currentMonth = monthlyCalendar.askForMonth();
        Mirror mirror = new Mirror();
        Drawer drawer = new Drawer();
        Outfit outfit = drawer.getOutfitForToday(currentMonth, currentDay);
        mirror.sayHowItLooks(currentDay, currentMonth, outfit);
    }
}
