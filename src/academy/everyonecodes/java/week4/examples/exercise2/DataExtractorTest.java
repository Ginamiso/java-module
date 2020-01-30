package academy.everyonecodes.java.week4.examples.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DataExtractorTest {
    DataExtractor dataExtractor = new DataExtractor();

    @ParameterizedTest
    @CsvSource({
            "10012020, PHOTO_10012020.png",
            "24122019,PHOTO_24122019.png",
            "03042001, PHOTO_03042001.png",
            "'', PHOTO_.png"
    })
    void extract(String expected, String input){
        String result = dataExtractor.extract(input);

        Assertions.assertEquals(expected, result);
    }
}
