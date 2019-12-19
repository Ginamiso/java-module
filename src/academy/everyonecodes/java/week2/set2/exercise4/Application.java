package academy.everyonecodes.java.week2.set2.exercise4;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        StepCollector stepCollector = new StepCollector();
        List<Integer> steps = stepCollector.collect();
        AverageCalculator averageCalculator = new AverageCalculator();
        double average = averageCalculator.calculateAverage(steps);
        System.out.println(average);
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        double kilometers = distanceCalculator.calculateDistanceInKilometer(average);
        System.out.println(kilometers);
    }
}
