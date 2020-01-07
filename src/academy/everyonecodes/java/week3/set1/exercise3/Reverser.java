package academy.everyonecodes.java.week3.set1.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Reverser {
    public List<Integer> reverse(List<Integer> numbers) {
        List<Integer> reversedNumbers = new ArrayList<>();
        int size = numbers.size();
        if (size == 0) {
            return reversedNumbers;
        }
        for (int i = size - 1; i >= 0; i--) {
            int number = numbers.get(i);
            reversedNumbers.add(number);
        }
        return reversedNumbers;
    }
}
