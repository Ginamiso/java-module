package academy.everyonecodes.java.week7.set2.exercise5;

import academy.everyonecodes.java.week5.set2.exercise4.HappinessDataParser;
import academy.everyonecodes.java.week5.set2.exercise4.HappinessRecord;
import academy.everyonecodes.java.week7.set2.exercise4.StreamFileReader;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HappinessDataReader {

    private HappinessDataParser parser = new HappinessDataParser();
    private StreamFileReader reader = new StreamFileReader();
    private String contentRootPath = "src/academy/everyonecodes/java/week7/set2/files/world-happiness-2017 (1).csv";

    public List<HappinessRecord> read(){
        Stream<String> lines = reader.readLines(contentRootPath);
        List<HappinessRecord> happinessRecord = lines.skip(1)
                .map(line -> parser.parseLine(line))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        return happinessRecord;
    }
}
