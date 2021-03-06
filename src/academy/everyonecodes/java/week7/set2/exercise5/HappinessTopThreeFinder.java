package academy.everyonecodes.java.week7.set2.exercise5;

import academy.everyonecodes.java.week5.set2.exercise4.HappinessRecord;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HappinessTopThreeFinder {

    private final HappinessDataReader reader = new HappinessDataReader();

    public List<String> findTopThree() {
        return reader.read().stream()
                .sorted(Comparator.comparing(HappinessRecord::getRank))
                .limit(3)
                .map(HappinessRecord -> "Country: " + HappinessRecord.getCountry() + " Score: " + HappinessRecord.getScore())
                .collect(Collectors.toList());

    }
}
