package academy.everyonecodes.java.week8.extraExercises.exercise2;

import academy.everyonecodes.java.gitIgnore.week5.set2.exercise5.GotDataReader;

public class DeathCounter {
    private GotDataReader reader = new GotDataReader();
    public long count(){
        return reader.read().stream()
                .filter(character -> character.getBookOfDeath().isPresent())
                .count();
    }
}
