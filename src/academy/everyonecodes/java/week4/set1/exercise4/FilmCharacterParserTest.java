package academy.everyonecodes.java.week4.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

class FilmCharacterParserTest {
    FilmCharacterParser filmCharacterParser = new FilmCharacterParser();

    @ParameterizedTest
    @CsvSource({
            "Anakin, Skywalker, Anakin;Skywalker",
            "Frodo, Baggings, Frodo;Baggings",
            "Han, Solo, Han;Solo"
    })
    void parse(String expectedFirst, String expectedSecond, String input){

        FilmCharacter result = filmCharacterParser.parse(input);


        Assertions.assertEquals(expectedFirst, result.getFirstName());
        Assertions.assertEquals(expectedSecond, result.getLastName());
    }
}
