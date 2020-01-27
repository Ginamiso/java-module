package academy.everyonecodes.java.week5.set1.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

public class StringOverlapFinder {


    public Optional<String> find(String first, String second) {
        if (first.isEmpty() || second.isEmpty()) {
            return Optional.empty();
        }
        int length = first.length();
        int lastIndex = length - 1;
        for (int position = lastIndex; position >= 0; position--) {
            String partToTest = first.substring(position, length);
            if (second.startsWith(partToTest)) {
                return Optional.of(partToTest);
            }
        }
        return Optional.empty();
    }
}


