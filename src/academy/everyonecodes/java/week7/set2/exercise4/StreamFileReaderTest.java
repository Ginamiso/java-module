package academy.everyonecodes.java.week7.set2.exercise4;

import academy.everyonecodes.java.evaluation1.importedClasses.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class StreamFileReaderTest {

    StreamFileReader fileReader = new StreamFileReader();
    String path = "src/academy/everyonecodes/java/week7/set2/files/animals.txt";

    @Test
    void read() {

        Stream<String> result = fileReader.readLines(path);
        Stream<String> expected = Stream.of("Giraffe", "Lion" , "Fish" , "Tiger" , "Snake" , "Dog" , "Horse" , "Cat" , "Snail", "Mouse");
        List<String> oResult = result.collect(Collectors.toList());
        List<String> oExpected = expected.collect(Collectors.toList());

        Assertions.assertEquals(oResult, oExpected);

    }
}