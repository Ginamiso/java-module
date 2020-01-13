package academy.everyonecodes.java.week4.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FilmCharacterParserTest {
    FilmCharacterParser filmCharacterParser = new FilmCharacterParser();

    @Test
    void parse(){

        String input = "Anakin;Skywalker";
        FilmCharacter result = filmCharacterParser.parse(input);
        List<String> results = List.of(result.getFirstName(), result.getLastName());
        List<String> resultList = List.of("Anakin","Skywalker");

        Assertions.assertEquals(results, resultList);
    }
}
