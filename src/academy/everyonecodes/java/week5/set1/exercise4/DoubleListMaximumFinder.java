package academy.everyonecodes.java.week5.set1.exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DoubleListMaximumFinder {
    public Optional<Double> find(List<Double> numbers) {
        if(numbers.size() == 0){
            return Optional.empty();
        }
        List<Double> copy = new ArrayList<>(numbers);
        Collections.sort(copy);
        Collections.reverse(copy);
        double max = copy.get(0);
        return Optional.of(max);
    }
}
