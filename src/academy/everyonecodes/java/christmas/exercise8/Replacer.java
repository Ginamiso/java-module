package academy.everyonecodes.java.christmas.exercise8;

import java.util.ArrayList;
import java.util.List;

public class Replacer {
    public List<Integer> replaceValue(int newValue, int position, List<Integer> numbers) {
        List<Integer> replaced = new ArrayList<>();
        for (int i = 0; i<numbers.size(); i++) {
            int currentValue = numbers.get(i);
            if (i==position){
                currentValue=newValue;
            }
            replaced.add(currentValue);

        }
        return replaced;

    }
}
