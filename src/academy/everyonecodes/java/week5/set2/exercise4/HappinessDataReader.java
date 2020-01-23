package academy.everyonecodes.java.week5.set2.exercise4;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HappinessDataReader {

    public List<Optional<HappinessRecord>> read(){
        Path path = Path.of("src/academy/everyonecodes/java/week5/set2/files/world-happiness-2017.csv");

        HappinessDataParser happinessDataParser = new HappinessDataParser();

        ArrayList<Optional<HappinessRecord>> listOfHappinessRecord = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(path);
            for (String string : lines) {
                Optional<HappinessRecord> one = happinessDataParser.parseLine(string);
                if (one.isPresent()) {
                    listOfHappinessRecord.add(one);
                }
            }
            return listOfHappinessRecord;
        }catch (IOException e){
            e.printStackTrace();
            return listOfHappinessRecord;
        }


    }


}
