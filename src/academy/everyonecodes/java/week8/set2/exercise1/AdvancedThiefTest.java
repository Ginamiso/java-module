package academy.everyonecodes.java.week8.set2.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class AdvancedThiefTest {
    AdvancedThief advancedThief = new AdvancedThief();

    @ParameterizedTest
    @CsvSource({
            "-2,0",
            "0,2",
            "2,4"
    })
    void open(int expected, int difficultyPoints) {
        Safe safe = new Safe(3,difficultyPoints);
        advancedThief.open(safe);

        assertEquals(expected, safe.getDifficultyPoints());
    }
}