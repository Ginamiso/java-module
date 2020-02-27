package academy.everyonecodes.java.evaluation2.handout.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioDeviceTest {

    RadioDevice radioDevice = new RadioDevice();

    @ParameterizedTest
    @MethodSource("parameters")
    void receive(Optional<String> expected, RadioMessage input) {
        Optional<String> result = radioDevice.receive(input);

        assertEquals(expected, result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(Optional.empty(), new RadioMessage("very bad content", 1500)),
                Arguments.of(Optional.of("Buongiorno El"), new RadioMessage("Buongiorno El", 4200)),
                Arguments.of(Optional.of("Great exercises"), new RadioMessage("Great exercises", 1900))
        );
    }
}
