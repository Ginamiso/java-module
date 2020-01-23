package academy.everyonecodes.java.week5.set2.exercise7;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LineLengthWriterTest {
    LineLengthWriter lineLengthWriter = new LineLengthWriter();
    FileReader fileReader= new FileReader();
    String path = "src/academy/everyonecodes/java/week5/set2/files/stringlengths.txt";

    @Test
    void write(){
        lineLengthWriter.write();
        List<String> list = fileReader.read(path);
        Assertions.assertEquals("86", list.get(0));

    }
}
