package academy.everyonecodes.java.optionals.sets.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicDictionaryTest {
    BasicDictionary basicDictionary = new BasicDictionary();

    @ParameterizedTest
    @MethodSource("parameters")
    void findUnknownWords(List<String> expected, String input) {
        List<String> result = basicDictionary.findUnknownWords(input);
        assertEquals(expected, result);
    }
    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(
                        List.of("the", "elegant", "jumped", "up"), "The elegant cat jumped up the table"),
                Arguments.of(List.of(), "hi"),
                Arguments.of(List.of(), ""),
                Arguments.of(List.of("the", "plane", "flies", "over"), "The plane flies over the house"));
    }
}