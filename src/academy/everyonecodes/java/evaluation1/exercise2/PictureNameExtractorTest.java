package academy.everyonecodes.java.evaluation1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PictureNameExtractorTest {
    PictureNameExtractor nameExtractor = new PictureNameExtractor();

    @ParameterizedTest
    @CsvSource({
            "sunshine, 01222013SunshinePic.jpg",
            "dereks birthday, 01082003Dereks-BirthdayPic.jpg",
            "snowflake,24122019SNOWFLAKEPic.jpg"
    })
    void nameExtractor(String expected, String input){
        String result = nameExtractor.extract(input);

        Assertions.assertEquals(expected, result);
    }
}
