package academy.everyonecodes.java.week5.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LoremIpsumReaderTest {
    LoremIpsumReader loremIpsumReader = new LoremIpsumReader();
    String path = "src/academy/everyonecodes/java/week5/set2/files/lorem-ipsum.txt";

    @Test
    void checkSize(){

        List<String> result = loremIpsumReader.reader.read(path);

        Assertions.assertEquals(4, result.size());
    }
    @Test
    void checkFirstAndLastLine(){
        List<String> result = loremIpsumReader.reader.read(path);
        String firstLine = result.get(0);
        String lastLine = result.get(result.size() -1);
        String expectedFirst = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        String expectedLast = "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        Assertions.assertEquals(expectedFirst, firstLine);
        Assertions.assertEquals(expectedLast, lastLine);
    }
}
