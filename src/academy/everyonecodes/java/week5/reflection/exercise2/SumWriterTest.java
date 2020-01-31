package academy.everyonecodes.java.week5.reflection.exercise2;

import academy.everyonecodes.java.week5.importedClasses.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumWriterTest {

    SumWriter sumWriter = new SumWriter();
    FileReader reader = new FileReader();
    String outputPath = "src/academy/everyonecodes/java/week5/reflection/files/output.csv";
    String expectedPath = "src/academy/everyonecodes/java/week5/reflection/files/expected.csv";


    @Test
    void write(){
        sumWriter.write();
        List<String> expected = reader.read(expectedPath);
        List<String> output = reader.read(outputPath);

        Assertions.assertLinesMatch(expected, output);

    }
    @AfterEach
    private void delete(){
        try{
            Path output = Path.of(outputPath);
            Files.delete(output);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
