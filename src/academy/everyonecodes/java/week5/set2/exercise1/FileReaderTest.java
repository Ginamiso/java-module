package academy.everyonecodes.java.week5.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FileReaderTest {

    FileReader fileReader = new FileReader();

    @Test
    void read(){
        String input = "src/academy/everyonecodes/java/week5/set2/files/document.txt";
        List<String> result = fileReader.read(input);
        List<String> expected = List.of("line 1;part 1-2", "line 2;part 2-2", "line 3;part 3-2");

        Assertions.assertEquals(expected, result);


    }
}
