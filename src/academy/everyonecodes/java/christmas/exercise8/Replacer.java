package academy.everyonecodes.java.christmas.exercise8;

import java.util.ArrayList;
import java.util.List;

public class Replacer {
    public List<Integer> replaceValue(int newValue, int position, List<Integer> numbers) {
        int count = 0;
        List<Integer> replaced = new ArrayList<>();
        for (int number : numbers) {
            if (count == position){
                replaced.add(newValue);
            }else{
                replaced.add(number);
            }count = count +1;
        }
        return replaced;

    }
}
