package academy.everyonecodes.java.week4.examples.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FileNameValidatorTest {
    FileNameValidator fileNameValidator = new FileNameValidator();

    @ParameterizedTest
    @CsvSource({
            "true, PHOTO_gatto.png",
            "false, PHOTO_cane.jpg",
            "false, FOTO_potato.png"
    })
    void validate(boolean expected, String input){
        boolean result = fileNameValidator.validate(input);

        Assertions.assertEquals(expected, result);

    }

}
