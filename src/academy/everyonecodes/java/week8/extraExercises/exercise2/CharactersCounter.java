package academy.everyonecodes.java.week8.extraExercises.exercise2;
import academy.everyonecodes.java.gitIgnore.week5.set2.exercise5.Character;
import academy.everyonecodes.java.gitIgnore.week5.set2.exercise5.GotDataReader;


import java.util.List;

public class CharactersCounter {
    GotDataReader reader = new GotDataReader();
    public int count(){
        List<Character> characters = reader.read();
        return characters.size();
    }
}
