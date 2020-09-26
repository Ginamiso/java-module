package academy.everyonecodes.java.week7.set2.exercise5;

import academy.everyonecodes.java.week5.set2.exercise4.HappinessDataParser;
import academy.everyonecodes.java.week5.set2.exercise4.HappinessRecord;
import academy.everyonecodes.java.week7.set2.exercise4.StreamFileReader;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HappinessDataReader {

    private final HappinessDataParser parser = new HappinessDataParser();
    private final StreamFileReader reader = new StreamFileReader();
    private final String contentRootPath = "src/academy/everyonecodes/java/week7/set2/files/world-happiness-2017 (1).csv";

    public List<HappinessRecord> read() {
        return reader.readLines(contentRootPath)
                .skip(1)
                .map(parser::parseLine)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

    }
}
