package academy.everyonecodes.java.week5.set2.exercise6;

import academy.everyonecodes.java.week5.set2.exercise5.Character;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class SpotifyDataReaderTest {
    SpotifyDataReader spotifyDataReader = new SpotifyDataReader();

    @Test
    void read() {
        List<Song> result = spotifyDataReader.read();
        Song oResult = result.get(0);
        Song expected = new Song("China", 2, "Anuel AA");
        Assertions.assertEquals(expected, oResult);
    }
}

