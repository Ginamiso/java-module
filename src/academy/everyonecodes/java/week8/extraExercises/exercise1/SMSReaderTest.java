package academy.everyonecodes.java.week8.extraExercises.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SMSReaderTest {
    SMSReader reader = new SMSReader();

    @Test
    void read() {
        List<SMS> result = reader.read();
        int resultSize = result.size();
        int expected = 5573;
        SMS resultFirst = result.get(0);
        SMS expectedFirst = new SMS("ham","Go until jurong point, crazy.. Available only in bugis n great world la e buffet... Cine there got amore wat...");
        Assertions.assertEquals(expected, resultSize);
        Assertions.assertEquals(expectedFirst, resultFirst);

    }
}