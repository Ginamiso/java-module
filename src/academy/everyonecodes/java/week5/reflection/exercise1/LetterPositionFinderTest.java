package academy.everyonecodes.java.week5.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

class LetterPositionFinderTest {
    LetterPositionFinder letterPositionFinder = new LetterPositionFinder();

    @ParameterizedTest
    @CsvSource({
            "1, casa, a",
            "2, mare, r",
            "3, fare, e"
    })
    void find(int expected, String word, String letter) {
        Optional<Integer> oResult = letterPositionFinder.find(word, letter);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }

    @ParameterizedTest
    @CsvSource({
            "posto, a",
            "mare, f",
            "fare, s"
    })
    void findReturnsEmptyOptional(String word, String letter) {
        Optional<Integer> oResult = letterPositionFinder.find(word, letter);

        Assertions.assertTrue(oResult.isEmpty());

    }
}
