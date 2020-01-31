package academy.everyonecodes.java.week5.set2.exercise7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LineLengthReaderTest {
    LineLengthReader lineLengthReader = new LineLengthReader();

    @Test
    void read(){
        List<Integer> result = lineLengthReader.read();
        String line = "Lorem ipsum dolor sit amet, consectetur adipiscing elit augue nec, metus proin primis.";
        Assertions.assertEquals(line.length(), result.get(0));
        Assertions.assertEquals(120, result.size());


    }
}
