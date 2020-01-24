package academy.everyonecodes.java.week5.reflection.exercise1;

import java.util.Optional;

public class LetterPositionFinder {
    public Optional<Integer> find(String word, String letter){
        if(!word.contains(letter)){
            return Optional.empty();
        }
        int index = word.indexOf(letter);
        return Optional.of(index);
    }
}
