package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.List;
import java.util.Optional;

public class GotDataParser {
    public Optional<Character> parseLine(String character) {
        List<String> characterList = List.of(character.split(";"));
        String bookOfDeathString = characterList.get(3);
        String genderString = characterList.get(6);
        String name = characterList.get(0);
        Optional<Integer> oBookOfDeath = Optional.of(0);
        int gender = 0;
        try {
            gender = Integer.valueOf(genderString);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return Optional.empty();
        }
        if (bookOfDeathString.length() < 1) {
            oBookOfDeath = Optional.empty();
        } else {
            try {
                oBookOfDeath = Optional.of(Integer.valueOf(bookOfDeathString));
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return Optional.empty();
            }
        }
        Character characterOne = new Character(name, oBookOfDeath, gender);
        return Optional.of(characterOne);
    }
}





