package academy.everyonecodes.java.week4.examples.exercise1;

import academy.everyonecodes.java.week4.examples.exercise1.DataReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class DataReaderTest {
    DataReader dataReader = new DataReader();

    @Test
    void readString(){
        String input = "first,second,third";
        List<String> expected = List.of("FIRST", "SECOND", "THIRD");
        List<String> result = dataReader.read(input);
        Assertions.assertEquals(expected, result);
    }
    @Test
    void readFunnyString(){
        String input = ",";

        List<String> result = dataReader.read(input);

        Assertions.assertEquals(List.of(), result);
    }
}
