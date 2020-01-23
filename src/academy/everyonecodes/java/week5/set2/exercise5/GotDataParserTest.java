package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class GotDataParserTest {
    GotDataParser gotDataParser = new GotDataParser();

    @Test
    void parseLine() {
        String input = "Alan of Rosby;Night's Watch;300;5;4;18;1;1;0;1;1;0;1";
        Character expected = new Character("Alan of Rosby", Optional.of(5), 1);
        Optional<Character> oResult = gotDataParser.parseLine(input);

        Assertions.assertTrue(oResult.isPresent());

        Assertions.assertEquals(expected.getName(), oResult.get().getName());
        Assertions.assertEquals(expected.getBookOfDeath(), oResult.get().getBookOfDeath());
        Assertions.assertEquals(expected.getGender(), oResult.get().getGender());

    }

    @Test
    void parseLine2() {
        String input = "Addam Marbrand;Lannister;;;;56;1;1;1;1;1;1;0";
        Character expected = new Character("Addam Marbrand", Optional.empty(), 1);
        Optional<Character> oResult = gotDataParser.parseLine(input);

        Assertions.assertTrue(oResult.isPresent());

        Assertions.assertEquals(expected.getName(), oResult.get().getName());
        Assertions.assertEquals(expected.getBookOfDeath(), oResult.get().getBookOfDeath());
        Assertions.assertEquals(expected.getGender(), oResult.get().getGender());
    }

    @Test
    void parseLineReturnsCharacterWithoutBook() {
        String input = "Arya Stark;Stark;;;;2;0;1;1;1;1;1;1";
        Character expected = new Character("Arya Stark", Optional.empty(), 0);
        Optional<Character> oResult = gotDataParser.parseLine(input);

        Assertions.assertTrue(oResult.isPresent());

        Assertions.assertEquals(expected.getName(), oResult.get().getName());
        Assertions.assertEquals(expected.getBookOfDeath(), oResult.get().getBookOfDeath());
        Assertions.assertEquals(expected.getGender(), oResult.get().getGender());

    }
}