package academy.everyonecodes.java.week5.set2.exercise6;

import academy.everyonecodes.java.week5.set2.exercise4.HappinessRecord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class SpotifyDataParserTest {
    SpotifyDataParser spotifyDataParser = new SpotifyDataParser();

    @Test
    void parseLine() {
        String input = "2;China;Anuel AA;reggaeton flow;105;81;79;-4;8;61;302;8;9;92";
        Optional<Song> oResult = spotifyDataParser.parseLine(input);
        Song expected = new Song("China", 2, "Anuel AA");

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected.getTitle(), oResult.get().getTitle());
        Assertions.assertEquals(expected.getRank(), oResult.get().getRank());
        Assertions.assertEquals(expected.getArtist(), oResult.get().getArtist());

    }

    @Test
    void parseLine2() {
        String input = "1;Señorita;Shawn Mendes;canadian pop;117;55;76;-6;8;75;191;4;3,79";
        Optional<Song> oResult = spotifyDataParser.parseLine(input);
        Song expected = new Song("Señorita", 1, "Shawn Mendes");

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected.getTitle(), oResult.get().getTitle());
        Assertions.assertEquals(expected.getRank(), oResult.get().getRank());
        Assertions.assertEquals(expected.getArtist(), oResult.get().getArtist());

    }

    @Test
    void parseLine3() {
        String input = ";;Señorita;Shawn Mendes;canadian pop;117;55;76;-6;8;75;191;4;3,79";
        Optional<Song> oResult = spotifyDataParser.parseLine(input);

        Assertions.assertTrue(oResult.isEmpty());
    }
}
