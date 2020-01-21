package academy.everyonecodes.java.week5.set1.exercise3;

import java.util.List;
import java.util.Optional;

public class IntegerListAverageCalculator {

    public Optional<Double> calculate(List<Integer> numbers) {
        int size = numbers.size();
        double result = 0.0;
        if (size == 0) {
            return Optional.empty();
        } else {
            for (int number : numbers) {
                result = result + number;
            }
        }
        double average = result / size;
        return Optional.of(average);
    }
}