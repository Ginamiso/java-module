package academy.everyonecodes.java.week5.set2.exercise4;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HappinessDataReader {

    private HappinessDataParser happinessDataParser = new HappinessDataParser();
    private FileReader reader = new FileReader();
    private String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/world-happiness-2017.csv";

    public List<HappinessRecord> read() {
        List<String> lines = reader.read(contentRootPath);
        List<HappinessRecord> listOfHappinessRecord = new ArrayList<>();

        for (String string : lines) {
            Optional<HappinessRecord> oRecord = happinessDataParser.parseLine(string);
            if (oRecord.isPresent()) {
                listOfHappinessRecord.add(oRecord.get());
            }
        }
        return listOfHappinessRecord;
    }
}

