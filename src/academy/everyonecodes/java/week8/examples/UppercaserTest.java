package academy.everyonecodes.java.week8.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class UppercaserTest {
    Uppercaser uppercaser = new Uppercaser();

    @ParameterizedTest
    @MethodSource("parameters")
    void modify(Phrase expected, Phrase input) {
        uppercaser.modify(input);
        Assertions.assertEquals(expected, input);
    }
    private static Stream<Arguments> parameters(){
        return Stream.of(
                Arguments.of(new Phrase("CIAO", "me"),new Phrase("ciao", "me")),
                Arguments.of(new Phrase("MIAO", "you"), new Phrase("miao", "you")),
                Arguments.of(new Phrase("", ""), new Phrase("",""))
        );
    }
}