package academy.everyonecodes.java.week5.set2.exercise2;


import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

class FileWriterTest {

    FileWriter fileWriter = new FileWriter();
    FileReader reader = new FileReader();
    String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/FileWriter.txt";

    @Test

    void write(){
        List<String> inputs = List.of("Line 1", "Line 2", "Line 3");

        fileWriter.write(contentRootPath, inputs);
        List<String> result = reader.read(contentRootPath);

        List<String> expected = List.of("Line 1", "Line 2", "Line 3");

        Assertions.assertEquals(expected, result);


    }
    @Test
    void writeAppends(){
        List<String> first = List.of("Line 1", "Line 2", "Line 3");
        List<String> second = List.of("Jam", "Sugar", "Coffee");

        fileWriter.append(contentRootPath, first);
        fileWriter.append(contentRootPath, second);

        List<String> result = reader.read(contentRootPath);

        List<String> expected = List.of("Line 1", "Line 2", "Line 3","Jam", "Sugar", "Coffee");

        Assertions.assertEquals(expected, result);
    }
    @AfterEach
    void delete(){
        Path path = Path.of(contentRootPath);
        try{
            Files.deleteIfExists(path);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
