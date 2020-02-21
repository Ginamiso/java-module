package academy.everyonecodes.java.optionals.sets.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class IntegerListDuplicateRemoverTest {
    IntegerListDuplicateRemover remover = new IntegerListDuplicateRemover();
    @ParameterizedTest
    @MethodSource("parameters")
    void remove(List<Integer> expected, List<Integer> input){
        List<Integer> result = remover.remove(input);

        Assertions.assertEquals(expected, result);
    }
    private static Stream<Arguments> parameters(){
        return Stream.of(
                Arguments.of(List.of(1,2,3,4), List.of(1,2,3,4,4,2,1)),
                Arguments.of(List.of(), List.of())
        );
    }
}
