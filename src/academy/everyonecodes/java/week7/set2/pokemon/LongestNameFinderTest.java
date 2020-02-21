package academy.everyonecodes.java.week7.set2.pokemon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class LongestNameFinderTest {
    LongestNameFinder finder = new LongestNameFinder();

    @Test
    void find() {
        Optional<String> result = finder.find();
        Assertions.assertTrue(result.isPresent());
        String name = result.get();
        String expected = "CharizardMega Charizard X";
        Assertions.assertEquals(expected, name);

    }
}