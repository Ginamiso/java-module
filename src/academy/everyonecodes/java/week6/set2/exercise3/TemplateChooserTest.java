package academy.everyonecodes.java.week6.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TemplateChooserTest {
    TemplateChooser templateChooser = new TemplateChooser();
    @ParameterizedTest
    @CsvSource({
            "privileged, Ms. Oana Hokopoko",
            "privileged, Mr. Riccardo Hokopoko",
            "female, Mrs. Eugenia Buccellato",
            "male, Mr. Riccardo Wasserman",
            "default, Sercan Gülucü",
            "default, ''"
    })
    void choose(String expected, String input){
        String result = templateChooser.choose(input);

        Assertions.assertEquals(expected, result);
    }
}
