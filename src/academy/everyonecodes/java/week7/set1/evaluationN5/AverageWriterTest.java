package academy.everyonecodes.java.week7.set1.evaluationN5;

import academy.everyonecodes.java.evaluation1.exercise5.AverageWriter;
import academy.everyonecodes.java.evaluation1.importedClasses.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class AverageWriterTest {

    AverageWriter averageWriter = new AverageWriter();
    FileReader reader = new FileReader();

    String inputPath = "src/academy/everyonecodes/java/evaluation1/files/numbers.txt";
    String outputPath = "src/academy/everyonecodes/java/evaluation1/files/averages.txt";
    String expectedPath = "src/academy/everyonecodes/java/evaluation1/files/averages_expected.txt";


    @Test
    void write() {
        averageWriter.write(inputPath, outputPath);
        List<String> expected = reader.read(expectedPath);
        List<String> result = reader.read(outputPath);

        Assertions.assertLinesMatch(expected, result);
    }

    @AfterEach
    void deleteFile() {
        Path path = Path.of(outputPath);
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}