package academy.everyonecodes.java.week8.extraExercises.exercise1;

import academy.everyonecodes.java.week7.set2.exercise4.StreamFileReader;

import java.util.List;
import java.util.stream.Collectors;

public class SMSReader {

    private StreamFileReader reader = new StreamFileReader();
    private String contentRootPath = "src/academy/everyonecodes/java/week8/extraExercises/files/sms.csv";
    private SMSParser parser = new SMSParser();

    public List<SMS> read(){
        return reader.readLines(contentRootPath)
                .skip(1)
                .map(line -> parser.parse(line))
                .collect(Collectors.toList());
    }

}
