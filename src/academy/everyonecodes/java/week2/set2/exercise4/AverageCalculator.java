package academy.everyonecodes.java.week2.set2.exercise4;

import java.util.List;

public class AverageCalculator {
    public double calculateAverage(List<Integer> numbers) {
        int size = numbers.size();
        double sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        double average = sum / size;
        return average;
    }
}
