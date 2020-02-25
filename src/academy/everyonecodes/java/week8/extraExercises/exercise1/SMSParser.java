package academy.everyonecodes.java.week8.extraExercises.exercise1;

import java.util.List;

public class SMSParser {
    public SMS parse(String line){
        List<String> parsedLine = List.of(line.split(";"));
        String type = parsedLine.get(0);
        String text = parsedLine.get(1);
        SMS sms = new SMS(type, text);
        return sms;
    }
}
