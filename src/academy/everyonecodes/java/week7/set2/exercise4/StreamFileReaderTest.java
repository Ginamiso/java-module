package academy.everyonecodes.java.week7.set2.exercise4;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class StreamFileReaderTest {

    StreamFileReader fileReader = new StreamFileReader();
    String path = "src/academy/everyonecodes/java/week7/set2/files/animals.txt";

    @Test
    void read() {

        List<String> result = fileReader.readLines(path)
                .collect(Collectors.toList());

        List<String> expected = List.of("Giraffe", "Lion" , "Fish" , "Tiger" , "Snake" , "Dog" , "Horse" , "Cat" , "Snail", "Mouse");


        assertEquals(result, expected);

    }
}