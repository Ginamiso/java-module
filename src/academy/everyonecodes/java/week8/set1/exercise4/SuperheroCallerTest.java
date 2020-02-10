package academy.everyonecodes.java.week8.set1.exercise4;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;


class SuperheroCallerTest {
    SuperheroCaller caller = new SuperheroCaller();

    @ParameterizedTest
    @MethodSource("parametersOne")
    void findsSuperheros(Superhero expected, String input) {
        Optional<Superhero> oResult = caller.findSuperhero(input);
        Assertions.assertTrue(oResult.isPresent());


        Assertions.assertEquals(expected, oResult.get());
        Assertions.assertEquals(expected,oResult.get());
    }

    private static Stream<Arguments> parametersOne() {

        Batman batman = new Batman();
        Superman superman = new Superman();
        Spiderman spiderman = new Spiderman();

        return Stream.of(
                Arguments.of(batman, "Alan"),
                Arguments.of(superman, "Bob"),
                Arguments.of(spiderman, "Ted"),
                Arguments.of(batman, "Batman"),
                Arguments.of(superman, "Superman"),
                Arguments.of(spiderman, "Spiderman")

        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void findsNoSuperhero(Optional<Superhero> expected, String input) {
        Optional<Superhero> oResult = caller.findSuperhero(input);

        Assertions.assertTrue(oResult.isEmpty());
        Assertions.assertEquals(expected, oResult);
    }

    private static Stream<Arguments> parameters() {

        return Stream.of(
                Arguments.of(Optional.empty(), ""),

                Arguments.of(Optional.empty(), "Gina")

        );
    }
}