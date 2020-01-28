package academy.everyonecodes.java.week6.set2.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerLeftShifter {
    public List<Integer> shiftOne(List<Integer> numbers) {
        List<Integer> copy = new ArrayList<>(numbers);
        Collections.rotate(copy, -1);
        return copy;
    }
}
