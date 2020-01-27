package academy.everyonecodes.java.week5.reflection.exercise2;

import java.util.ArrayList;
import java.util.List;

public class StringToIntegersParser {

    public List<Integer> parse(String stringOfNumbers) {
        List<String> listOfNumbers = List.of(stringOfNumbers.split(";"));
        List<Integer> numbers = new ArrayList<>();
        for(String string : listOfNumbers){
            try{
                int number = Integer.valueOf(string);
                numbers.add(number);
            }catch (NumberFormatException e) {
                e.printStackTrace();
                return new ArrayList<>();
            }

        }return numbers;
    }
}
