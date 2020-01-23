package academy.everyonecodes.java.week5.set2.exercise6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SpotifyDataReader {
    public List<Song> read() {
        String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/spotify-top-50.csv";
        List<Song> listOfSongs = new ArrayList<>();
        SpotifyDataParser dataParser = new SpotifyDataParser();
        Path path = Path.of(contentRootPath);
        try {
            List<String> list = Files.readAllLines(path);
            for (String string : list) {
                Optional<Song> song = dataParser.parseLine(string);
                if (song.isPresent()) {
                    listOfSongs.add(song.get());

                }
            }
                return listOfSongs;
            }catch(IOException e){
                    e.printStackTrace();
                    return listOfSongs;
                }

        }
    }
