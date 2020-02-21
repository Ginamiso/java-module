package academy.everyonecodes.java.optionals.maps.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

class StringToLengthMapperTest {
    StringToLengthMapper mapper = new StringToLengthMapper();

    @ParameterizedTest
    @MethodSource("parameters")
    void map(Map<String, Integer> expected, List<String> input) {
        Map<String, Integer> result = mapper.map(input);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(Map.of("hi", 2, "hello", 5), List.of("hi", "hello")),
                Arguments.of(Map.of("", 0), List.of("")),
                Arguments.of(Map.of(), List.of()));
    }
}
