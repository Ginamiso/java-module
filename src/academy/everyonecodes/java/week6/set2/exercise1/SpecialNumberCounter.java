package academy.everyonecodes.java.week6.set2.exercise1;

import java.util.List;

public class SpecialNumberCounter {
    public int count(int number) {
        String numberIntoString = String.valueOf(number);
        List<String> numbersInStringList = List.of(numberIntoString.split(""));
        List<String> numbers = List.of("3", "6", "9");
        int result = 0;
        for (String string : numbersInStringList) {
            if (numbers.contains(string)) {
                result = result + 1;
            }
        }
        return result;
    }
}