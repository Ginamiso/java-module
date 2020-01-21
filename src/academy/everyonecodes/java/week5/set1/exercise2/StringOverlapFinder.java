package academy.everyonecodes.java.week5.set1.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

public class StringOverlapFinder {


    public Optional<String> find(String name1, String name2) {
        int length = name2.length();
        while(length >= 1){
            if(name1.contains(name2.substring(0,length))){
                String overlap = name2.substring(0,length);
                return Optional.of(overlap);
            }else{
                length--;
            }
        }
        return Optional.empty();
    }
}
