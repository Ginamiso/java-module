package academy.everyonecodes.java.week9.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

class AnimalMovementScholarTest {
    AnimalMovementScholar scholar = new AnimalMovementScholar();

    @ParameterizedTest
    @MethodSource("parameters")
    void elaborate(Optional<String> expected, String input) {
        Optional<String> result = scholar.elaborate(input);
        Assertions.assertEquals(expected, result);
    }
    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(Optional.of("walk,run"), "dog"),
                Arguments.of(Optional.of("climb,run,walk"), "mammal"),
                Arguments.of(Optional.empty(), "cat")
        );
    }
}
