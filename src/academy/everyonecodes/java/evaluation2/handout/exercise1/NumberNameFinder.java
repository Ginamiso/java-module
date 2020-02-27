package academy.everyonecodes.java.evaluation2.handout.exercise1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NumberNameFinder {

    public Optional<String> find(List<String> numbers) {
        return numbers.stream()
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .findFirst();
    }
}
