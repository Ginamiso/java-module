package academy.everyonecodes.java.week8.extraExercises.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeathCounterTest {
    DeathCounter deathCounter = new DeathCounter();

    @Test
    void count() {
        long result = deathCounter.count();
        long expected = 307;
        Assertions.assertEquals(expected, result);
    }
}