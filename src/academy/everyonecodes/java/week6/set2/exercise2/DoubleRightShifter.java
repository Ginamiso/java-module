package academy.everyonecodes.java.week6.set2.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoubleRightShifter {
    public List<Double> shiftTwo(List<Double> numbers) {
        List<Double> copy = new ArrayList<>(numbers);
        Collections.rotate(copy, 2);
        return copy;
    }
}
