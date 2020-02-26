package academy.everyonecodes.java.optionals.sets.exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntegerListDuplicateRemover {

    public List<Integer> remove(List<Integer> numbers) {
        Set<Integer> set = new HashSet<>(numbers);
        numbers = new ArrayList<>(set);
        return numbers;

    }
}
