package academy.everyonecodes.java.week4.set1.exercise4;

import java.util.List;

public class FilmCharacterParser {
    public FilmCharacter parse(String string){
        List<String> nameAndLastName = List.of(string.split(";"));
        FilmCharacter filmCharacter = new FilmCharacter(nameAndLastName.get(0), nameAndLastName.get(1));
        return filmCharacter;
    }
}
