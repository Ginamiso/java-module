package academy.everyonecodes.java.evaluation1.exercise3;

import java.util.List;

public class VowelCounter {
    public int count(String word) {
        List<String> vowels = List.of("a","e", "i","o", "u");
        int vowelsCount = 0;
        List<String> letters = List.of(word.split(""));
        for(String letter: letters){
            if(vowels.contains(letter)){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
