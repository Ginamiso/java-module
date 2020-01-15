package academy.everyonecodes.java.week4.set2.exercise2;

import java.util.ArrayList;
import java.util.List;

public class StringAsIntegerListParser {
    public List<Integer> parse(String numbers) {
        List<String> listOfStrings = List.of(numbers.split(";"));
        List<Integer> listOfIntegers = new ArrayList<>();
        for(String number : listOfStrings){
            int value = Integer.valueOf(number);
            listOfIntegers.add(value);
        }
        return listOfIntegers;

    }
}
