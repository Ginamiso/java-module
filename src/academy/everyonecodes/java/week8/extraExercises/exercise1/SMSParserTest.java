package academy.everyonecodes.java.week8.extraExercises.exercise1;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SMSParserTest {
    SMSParser smsParser= new SMSParser();

    @ParameterizedTest
    @MethodSource("parameters")
    void parse(SMS expected, String input) {
        SMS result = smsParser.parse(input);
        Assertions.assertEquals(expected, result);
    }
    private static Stream<Arguments> parameters(){
        return Stream.of(
                Arguments.of(new SMS("ham","Go until jurong point, crazy.. Available only in bugis n great world la e buffet... Cine there got amore wat..."),
                        "ham;Go until jurong point, crazy.. Available only in bugis n great world la e buffet... Cine there got amore wat...;;;"),
                Arguments.of(new SMS("spam","ciao"),"spam;ciao"),
                Arguments.of(new SMS("hallo","hallo"),"hallo;hallo"));

    }

}