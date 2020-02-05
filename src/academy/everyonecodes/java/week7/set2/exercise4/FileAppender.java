package academy.everyonecodes.java.week7.set2.exercise4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileAppender {
    public void append(String contentRootPath, String line) {
        Path path = Path.of(contentRootPath);
        List<String> lines = List.of(line);
        try {
            Files.write(path, lines, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
