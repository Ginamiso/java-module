package academy.everyonecodes.java.week4.reflection.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BeforeDashExtractorTest {
    BeforeDashExtractor beforeDashExtractor = new BeforeDashExtractor();

    @ParameterizedTest
    @CsvSource({
            "my, my-string",
    })
    void extract(String expected, String input){
        String result = beforeDashExtractor.extract(input);
    }
}
