package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.List;
import java.util.Optional;

public class DeathsInBookCounter {
    public Optional<Integer> count(List<Character> characters, int book) {
        if (characters.isEmpty()) {
            return Optional.empty();
        }
            int result = 0;
            for (Character character : characters) {
                if (character.getBookOfDeath().isPresent() && character.getBookOfDeath().get() == book) {
                    result = result + 1;
                }
            }
            return Optional.of(result);

        }
    }
