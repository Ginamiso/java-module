package academy.everyonecodes.java.week8.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SpacerTest {
    Modifier spacer = new Spacer();
    @ParameterizedTest
    @CsvSource({
            "'c o ', co",
            "' ',''",
            "'c ', c"
    })
    void modify(String expected, String input){
        Phrase phrase = new Phrase(input, "miao");
        spacer.modify(phrase);

        Assertions.assertEquals(expected, phrase.getText());
    }
}
