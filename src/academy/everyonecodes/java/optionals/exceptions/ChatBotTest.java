package academy.everyonecodes.java.optionals.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ChatBotTest {

    ChatBot chatBot = new ChatBot();

    @ParameterizedTest
    @CsvSource({
            "Temperature raised by 2, temperature 2",
            "Temperature lowered by 5, temperature -5",
            "Argument not supported: bla, temperature bla",
            "Argument not supported: meh, lights meh",
            "Argument not supported: bla, bla bla",
            "Lights switched on, lights on",
            "Lights switched off, lights off",
            "'Argument not supported: ', ''"
    })
    void handle(String expected, String input) {
        String result = chatBot.handle(input);
        Assertions.assertEquals(expected, result);
    }
}