package academy.everyonecodes.java.week5.set2.exercise4;

import java.util.List;
import java.util.Optional;

public class HappinessDataParser {
    public Optional<HappinessRecord> parseLine(String string){
        List<String> parsedLines = List.of(string.split(";"));
        String country = parsedLines.get(0);
        String rankString = parsedLines.get(1);
        String scoreString = parsedLines.get(2);
        try{
            double score = Double.valueOf(scoreString);
            int rank = Integer.valueOf(rankString);
            HappinessRecord happinessRecord = new HappinessRecord(country, rank, score);
            return Optional.of(happinessRecord);
        }catch (NumberFormatException e) {
            return Optional.empty();
        }

    }
}
