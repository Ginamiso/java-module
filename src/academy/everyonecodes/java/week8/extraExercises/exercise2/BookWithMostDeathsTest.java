package academy.everyonecodes.java.week8.extraExercises.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BookWithMostDeathsTest {
    BookWithMostDeaths counter = new BookWithMostDeaths();

    @Test
    void count() {
        String result = counter.count();
        String expected = "Book number 3 with 97 deaths.";
        Assertions.assertEquals(expected, result);
    }
}