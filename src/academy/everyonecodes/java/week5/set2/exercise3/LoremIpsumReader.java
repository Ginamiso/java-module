package academy.everyonecodes.java.week5.set2.exercise3;

import academy.everyonecodes.java.week5.importedClasses.FileReader;

import java.util.List;

public class LoremIpsumReader {
    FileReader reader = new FileReader();
    String path = "src/academy/everyonecodes/java/week5/set2/files/lorem-ipsum.txt";
    List<String> lorem = reader.read(path);
}
