package academy.everyonecodes.java.week4.examples.exercise1;

import java.util.ArrayList;
import java.util.List;

public class DataReader {
    public List<String> read(String string) {
        List<String> output = List.of(string.split(","));
        List<String> upperCase = new ArrayList<>();
        for(String element : output){
            String upperElement = element.toUpperCase();
            upperCase.add(upperElement);
        }
        return upperCase;
    }
}
