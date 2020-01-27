package academy.everyonecodes.java.week5.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

class StringOverlapFinderTest {
    StringOverlapFinder stringOverlapFinder = new StringOverlapFinder();

    @ParameterizedTest
    @CsvSource({
            "el, michael, elias",
            "an, man, anaconda",
            "ta, malta, tavola",
            "in, mountain, inside"
    })
    void findString(String expected, String input1, String input2) {
        Optional<String> oResult = stringOverlapFinder.find(input1, input2);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }

    @ParameterizedTest
    @CsvSource({
            "daniel, simon"
    })
    void findString2(String input1, String input2) {
        Optional<String> oResult = stringOverlapFinder.find(input1, input2);
        Assertions.assertTrue(oResult.isEmpty());

    }
}
