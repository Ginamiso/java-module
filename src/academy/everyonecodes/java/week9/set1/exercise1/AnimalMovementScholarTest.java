package academy.everyonecodes.java.week9.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class AnimalMovementScholarTest {
    AnimalMovementScholar scholar = new AnimalMovementScholar();

    @ParameterizedTest
    @MethodSource("parameters")
    void elaborate(String expected, String input) {
        String result = scholar.elaborate(input);
        Assertions.assertEquals(expected, result);
    }
    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("walk,run", "dog"),
                Arguments.of("climb,run,walk", "mammal"),
                Arguments.of("", "cat")
        );
    }
}
