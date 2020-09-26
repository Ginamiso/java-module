package academy.everyonecodes.java.week5.set2.exercise6;

import java.util.List;
import java.util.Optional;

public class SpotifyDataParser {
    public Optional<Song> parseLine(String string) {
        List<String> song = List.of(string.split(";"));
        String title = song.get(1);
        String rankString = song.get(0);
        String artist = song.get(2);
        try {
            int rank = Integer.parseInt(rankString);
            Song songObject = new Song(title, rank, artist);
            return Optional.of(songObject);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return Optional.empty();
        }

    }
}
