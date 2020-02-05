package academy.everyonecodes.java.week7.set2.exercise4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnimalsContainsTest {
    StreamFileReader reader = new StreamFileReader();
    FileAppender appender = new FileAppender();

    String contentRootPath = "src/academy/everyonecodes/java/week7/set2/files/animals.txt";
    String output = "src/academy/everyonecodes/java/week7/set2/files/animals-s.txt";
    String expectedPath = "src/academy/everyonecodes/java/week7/set2/files/animals-s_expected.txt";

    @Test
    void test() {
        Stream<String> lines = reader.readLines(contentRootPath);
        lines.filter(name -> name.contains("s") || name.contains("S"))
                .map(String::toUpperCase)
                .forEach(name -> appender.append(output, name));

        Stream<String> expected = reader.readLines(expectedPath);
        Stream<String> result = reader.readLines(output);

        List<String> expectedList = expected.collect(Collectors.toList());
        List<String> resultList = result.collect(Collectors.toList());

        Assertions.assertEquals(expectedList, resultList);
    }

        @AfterEach
        void delete() {
            Path path = Path.of(output);
            try {
                Files.deleteIfExists(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

