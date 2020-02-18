package academy.everyonecodes.java.week9.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AnimalKindScholarTest {
    AnimalKindScholar scholar = new AnimalKindScholar();

    @ParameterizedTest
    @MethodSource("parameters")
    void elaborate(String expected, String input) {
        String result = scholar.elaborate(input);

        Assertions.assertEquals(expected, result);
    }
    private static Stream<Arguments> parameters(){
        return Stream.of(
                Arguments.of("mammal","dog"),
                Arguments.of("", "cat"),
                Arguments.of("dog,gorilla", "mammal")
        );
    }
}