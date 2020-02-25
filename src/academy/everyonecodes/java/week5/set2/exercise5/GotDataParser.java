package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.List;
import java.util.Optional;

public class GotDataParser {
    public Optional<Character> parseLine(String character) {
        List<String> characterList = List.of(character.split(";"));
        String bookOfDeathString = characterList.get(3);
        String genderString = characterList.get(6);
        String name = characterList.get(0);
        Optional<Integer> oBookOfDeath;
        int gender = Integer.parseInt(genderString);
        if (bookOfDeathString.isEmpty()) {
            oBookOfDeath = Optional.empty();
        } else {
                oBookOfDeath = Optional.of(Integer.valueOf(bookOfDeathString));
            }
        Character characterOne = new Character(name, oBookOfDeath, gender);
        return Optional.of(characterOne);
    }
}





