package academy.everyonecodes.java.week4.examples.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RandomFileNamePickerTest {
    RandomFileNamePicker randomFileNamePicker = new RandomFileNamePicker();

    @Test
    void pick(){
        List<String> fileNames = List.of("file1", "file2", "file3");
        String result = randomFileNamePicker.pick(fileNames);

        Assertions.assertTrue(fileNames.contains(result));
    }

}
