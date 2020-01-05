package academy.everyonecodes.java.christmas.exercise8;

import java.util.List;


public class Incrementer {
    public List<Integer> incrementByOne(int position, List<Integer> numbers) {
        Replacer replacer = new Replacer();
        int newValue = numbers.get(position) + 1;
        return replacer.replaceValue(newValue, position, numbers);
    }
}
