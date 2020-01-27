package academy.everyonecodes.java.week3.set1.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Reverser {
    public List<Integer> reverse(List<Integer> numbers) {
        List<Integer> reversedNumbers = new ArrayList<>();
        int size = numbers.size();
        for (int i = size - 1; i >= 0; i--) {
            reversedNumbers.add(numbers.get(i));
        }
        return reversedNumbers;
    }
}
