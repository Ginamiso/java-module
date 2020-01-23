package academy.everyonecodes.java.week5.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class HappinessScoreFinderTest {
    HappinessScoreFinder happinessScoreFinder = new HappinessScoreFinder();


    @Test
    void findFor() {
        HappinessRecord one = new HappinessRecord("one", 1, 10.0);
        HappinessRecord two = new HappinessRecord("two", 2, 20.0);

        List<HappinessRecord> input = List.of(one, two);
        Optional<Double> oResult = happinessScoreFinder.findFor(input, "one");

        Assertions.assertEquals(10.0, oResult.get());
    }

    @Test
    void findFor2() {
        HappinessRecord one = new HappinessRecord("italy", 9, 15.5);
        HappinessRecord two = new HappinessRecord("japan", 7, 21.4);

        List<HappinessRecord> input = List.of(one, two);
        Optional<Double> oResult = happinessScoreFinder.findFor(input, "japan");

        Assertions.assertEquals(21.4, oResult.get());
    }
    @Test
    void findFor3() {

        List<HappinessRecord> input = List.of();
        Optional<Double> oResult = happinessScoreFinder.findFor(input, "japan");

        Assertions.assertTrue(oResult.isEmpty());
    }
}