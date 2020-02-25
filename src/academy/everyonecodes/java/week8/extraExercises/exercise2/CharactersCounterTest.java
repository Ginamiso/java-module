package academy.everyonecodes.java.week8.extraExercises.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharactersCounterTest {
    CharactersCounter counter = new CharactersCounter();

    @Test
    void count() {
        int expected = 917;
        int result = counter.count();
        Assertions.assertEquals(expected, result);
    }
}