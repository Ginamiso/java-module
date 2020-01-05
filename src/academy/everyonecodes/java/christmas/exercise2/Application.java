package academy.everyonecodes.java.christmas.exercise2;

public class Application {
    public static void main(String[] args) {
        double distanceToTram = 2.5;
        int stations = 5;
        double distanceToFriend = 1.2;
        TotalTimeCalculator  totalTimeCalculator = new TotalTimeCalculator();
        double totalTime = totalTimeCalculator.calculateTotalTime(stations, distanceToTram, distanceToFriend);
        System.out.println("The total is "+ totalTime + " minutes.");

    }
}
