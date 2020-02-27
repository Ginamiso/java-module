package academy.everyonecodes.java.evaluation2.handout.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberNameFinderTest {

    NumberNameFinder finder = new NumberNameFinder();

    @ParameterizedTest
    @MethodSource("parameters")
    void find(Optional<String> expected, List<String> input) {
        Optional<String> result = finder.find(input);

        assertEquals(expected, result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(Optional.of("ZERO"), List.of("one", "three", "zero", "nine")),
                Arguments.of(Optional.of("THREE"), List.of("one", "three", "ten")),
                Arguments.of(Optional.empty(), List.of())
        );
    }
}
