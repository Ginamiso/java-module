package academy.everyonecodes.java.week4.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BeforeDashExtractorTest {
    BeforeDashExtractor beforeDashExtractor = new BeforeDashExtractor();

    @ParameterizedTest
    @CsvSource({
            "my, my-string",
            "Some, Some-example",
            "'', noDash",
            "'',''"
    })
    void extract(String expected, String input){
        String result = beforeDashExtractor.extract(input);
        Assertions.assertEquals(expected, result);
    }

}
