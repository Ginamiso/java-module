package academy.everyonecodes.java.week5.set1.exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DoubleListMinimumFinder {
    public Optional<Double> find(List<Double> numbers) {
        if(numbers.isEmpty()){
            return Optional.empty();
        }
        List<Double> copy = new ArrayList<>(numbers);
        Collections.sort(copy);
        double min = copy.get(0);
        return Optional.of(min);
    }
}
