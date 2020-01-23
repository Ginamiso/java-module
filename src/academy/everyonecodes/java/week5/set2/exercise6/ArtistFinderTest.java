package academy.everyonecodes.java.week5.set2.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class ArtistFinderTest {
    ArtistFinder artistFinder = new ArtistFinder();

    @Test
    void findFor(){
        String input = "China";
        String expected = "Anuel AA";
        Optional<String> oResult = artistFinder.findFor(input);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());

    }
    @Test
    void findFor2(){
        String input = "";

        Optional<String> oResult = artistFinder.findFor(input);
        Assertions.assertTrue(oResult.isEmpty());


    }
}
