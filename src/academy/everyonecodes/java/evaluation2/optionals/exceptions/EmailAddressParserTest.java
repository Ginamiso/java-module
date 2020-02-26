package academy.everyonecodes.java.evaluation2.optionals.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class EmailAddressParserTest {

    EmailAddressParser parser = new EmailAddressParser();

    @ParameterizedTest
    @MethodSource("parameters")
    void parse(EmailAddress expected, String input) throws InvalidEmailException {
        EmailAddress result = parser.parse(input);

        Assertions.assertEquals(expected, result);
    }
    static Stream<Arguments> parameters(){
        return Stream.of(
                Arguments.of(new EmailAddress("gina", "pilotina"), "gina@pilotina"),
                Arguments.of(new EmailAddress("pina", "mallina"),"pina@mallina"),
                Arguments.of(new InvalidEmailException("Invalid Email"), "pina")
        );
    }
}
