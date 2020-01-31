package academy.everyonecodes.java.evaluation1.exercise4;

import academy.everyonecodes.java.evaluation1.importedClasses.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


class FileContentReverserTest {

    FileReader reader = new FileReader();
    FileContentReverser contentReverser = new FileContentReverser();

    String input = "src/academy/everyonecodes/java/evaluation1/files/lines.txt";
    String output = "src/academy/everyonecodes/java/evaluation1/files/lines-reversed.txt";
    String expectedPath = "src/academy/everyonecodes/java/evaluation1/files/lines-reversed_expected.txt";

    @Test
    void reverse(){
        contentReverser.reverse(input, output);
        List<String> resultLines = reader.read(output);
        List<String> expectedLines = reader.read(expectedPath);

        Assertions.assertLinesMatch(resultLines, expectedLines);

    }
    @AfterEach
    void deleteLinesReversedFile(){
        Path path = Path.of(output);
        try{
            Files.delete(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
