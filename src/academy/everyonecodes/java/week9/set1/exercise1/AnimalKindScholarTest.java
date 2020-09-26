package academy.everyonecodes.java.week9.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

class AnimalKindScholarTest {
    AnimalKindScholar scholar = new AnimalKindScholar();

    @ParameterizedTest
    @MethodSource("parameters")
    void elaborate(Optional<String> expected, String input) {
        Optional<String> result = scholar.elaborate(input);

        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(Optional.of("mammal"), "dog"),
                Arguments.of(Optional.of("dog,gorilla"), "mammal"),
                Arguments.of(Optional.of("angelfish,salmon"), "fish"),
                Arguments.of(Optional.empty(), "cat"),
                Arguments.of(Optional.empty(), "")
        );
    }
}