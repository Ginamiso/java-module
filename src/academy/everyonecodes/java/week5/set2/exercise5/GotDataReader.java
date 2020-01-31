package academy.everyonecodes.java.week5.set2.exercise5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GotDataReader {
    public List<Character> read() {
        Path path = Path.of("src/academy/everyonecodes/java/week5/set2/files/got-characters.csv");

        GotDataParser gotDataParser = new GotDataParser();

        List<Character> listOfData = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(path);
            for (String string : lines) {
                Optional<Character> one = gotDataParser.parseLine(string);
                if (one.isPresent()) {
                    listOfData.add(one.get());
                }
            }
            return listOfData;

        } catch (IOException e) {
            e.printStackTrace();
            return listOfData;
        }

    }
}


