package academy.everyonecodes.java.week5.set2.exercise5;

import academy.everyonecodes.java.evaluation1.importedClasses.FileReader;
import academy.everyonecodes.java.evaluation1.importedClasses.FileWriter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class DeadCharactersExtractorTest {
    DeadCharactersExtractor deadCharacters = new DeadCharactersExtractor();
    FileReader reader = new FileReader();
    FileWriter writer = new FileWriter();
    String contentRootPathResult = "src/academy/everyonecodes/java/week5/set2/files/deaths.txt";
    String contentRootPathExpected = "src/academy/everyonecodes/java/week5/set2/files/deaths_expected.txt";


    @Test
    void extract() {
        deadCharacters.extract();
        List<String> expected = reader.read(contentRootPathExpected);
        List<String> result = reader.read(contentRootPathResult);
        Assertions.assertEquals(expected.size(), result.size());

    }

    @AfterEach
    void delete() {
        Path path = Path.of(contentRootPathResult);
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
