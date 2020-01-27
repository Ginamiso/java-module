package academy.everyonecodes.java.week5.set1.exercise3;

import java.util.List;
import java.util.Optional;

public class IntegerListAverageCalculator {

    public Optional<Double> calculate(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return Optional.empty();
        }
        double result = 0;
        for (int number : numbers) {
            result += number;
        }
        double average = result/numbers.size();
        return Optional.of(average);
    }


}
