package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.List;
import java.util.Optional;

public class TotalDeathCounter {

    public Optional<Integer> count(List<Character> characters) {
        if(characters.isEmpty()){
            return Optional.empty();
        }
        int totalDeaths = 0;
        for(Character character : characters){
            if(character.getBookOfDeath().isPresent()){
                totalDeaths = totalDeaths +1;
            }
        }
        return Optional.of(totalDeaths);
    }
}
