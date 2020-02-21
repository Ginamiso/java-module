package academy.everyonecodes.java.optionals.sets.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class PersonListDuplicateRemoverTest {

    PersonListDuplicateRemover remover = new PersonListDuplicateRemover();

    @ParameterizedTest
    @MethodSource("parameters")
    void remove(List<Person> expected, List<Person> input) {
        List<Person> result = remover.remove(input);

        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> parameters() {
        Person gina = new Person("Gina", 33);
        Person agata = new Person("Agata", 36);
        Person andrea = new Person("Agata", 36);
        return Stream.of(
                Arguments.of(List.of(gina, agata), List.of(gina, agata, gina, andrea)),
                Arguments.of(List.of(), List.of())
        );
    }
}
