package academy.everyonecodes.java.codingContest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PointsCounterTest {
    PointsCounter counter = new PointsCounter();

    @Test
    void parseRound() {
        String input = "3:1,4,6,4,7,0";
        int result = counter.parseRound(input);
        int expected = 3;
        Assertions.assertEquals(expected, result);

    }
    @Test
    void parsePoints(){
        String input = "3:1,4,6,4,7,0";
        List<Integer> result = counter.parsePoints(input);
        List<Integer> expected = List.of(1,4,6,4,7,0);
        Assertions.assertEquals(expected, result);

    }
}