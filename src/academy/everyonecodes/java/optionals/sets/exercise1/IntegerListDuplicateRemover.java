package academy.everyonecodes.java.optionals.sets.exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntegerListDuplicateRemover {

    public List<Integer> remove(List<Integer> numbers) {
        HashSet set = new HashSet(numbers);
        numbers = new ArrayList<>(set);
        return numbers;

    }
}
