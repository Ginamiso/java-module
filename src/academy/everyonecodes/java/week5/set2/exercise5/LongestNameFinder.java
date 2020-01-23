package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.List;
import java.util.Optional;

public class LongestNameFinder {
    public Optional<Character> find(List<Character> characters) {
        if (characters.isEmpty()) {
            return Optional.empty();
        }
        Character longestName = characters.get(0);
        for (Character character : characters) {
            if (character.getName().length()> longestName.getName().length()){
                longestName = character;
            }
        }
        return Optional.of(longestName);

    }
}