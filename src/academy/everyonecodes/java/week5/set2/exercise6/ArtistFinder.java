package academy.everyonecodes.java.week5.set2.exercise6;

import java.util.List;
import java.util.Optional;

public class ArtistFinder {
    public Optional<String> findFor(String song){
        SpotifyDataReader dataReader = new SpotifyDataReader();
        List<Song> listOfSongs = dataReader.read();
        for(Song element : listOfSongs){
            if(element.getTitle().equals(song)){
                return Optional.of(element.getArtist());

            }

        }
        return Optional.empty();
    }
}
