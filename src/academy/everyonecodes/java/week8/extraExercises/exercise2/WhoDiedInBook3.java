package academy.everyonecodes.java.week8.extraExercises.exercise2;

import academy.everyonecodes.java.gitIgnore.week5.set2.exercise5.GotDataReader;

import java.util.List;
import java.util.stream.Collectors;

public class WhoDiedInBook3 {
    private GotDataReader reader = new GotDataReader();
    public List<String> find(){
        return reader.read().stream()
                .filter(character -> character.getBookOfDeath().isPresent())
                .filter((character -> character.getBookOfDeath().get().equals("3")))
                .map(character -> character.getName())
                .collect(Collectors.toList());
    }
}
