package academy.everyonecodes.java.week8.set2.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BeginnerThiefTest {
    BeginnerThief beginnerThief = new BeginnerThief();

    @ParameterizedTest
    @CsvSource({
            "2, 3",
            "-1,0",
            "0,1"
    })
    void open(int expected, int difficultyPoints) {
        Safe safe = new Safe(3,difficultyPoints);
        beginnerThief.open(safe);

        assertEquals(expected, safe.getDifficultyPoints());

    }
}