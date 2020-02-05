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

class FileAppenderTest {

    String contentRootPath = "src/academy/everyonecodes/java/week7/set2/files/document.txt";
    FileAppender fileAppender = new FileAppender();
    StreamFileReader streamFileReader = new StreamFileReader();

    @Test
    void append(){
        String line = "ciriciao";
        String line2 = "maramao";

        List<String> expected = List.of("ciriciao", "maramao");

        fileAppender.append(contentRootPath, line);
        fileAppender.append(contentRootPath, line2);

        Stream<String> result = streamFileReader.readLines(contentRootPath);
        List<String> list = result.collect(Collectors.toList());

        Assertions.assertEquals(expected, list);

    }
    @AfterEach
    void deleteNewAnimalsFile() {
        Path path = Path.of(contentRootPath);
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

