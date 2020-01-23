package academy.everyonecodes.java.week5.set2.exercise7;

import java.util.ArrayList;
import java.util.List;

public class IntegerListToStringListConverter {
    public List<String> convert(List<Integer> input){
        List<String> converted = new ArrayList<>();
        for(Integer number : input){
            String numberIntoString = String.valueOf(number);
            converted.add(numberIntoString);
        }
        return converted;
    }
}
