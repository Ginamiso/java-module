package academy.everyonecodes.java.week5.set2.exercise4;

import java.util.List;
import java.util.Optional;

public class HappinessScoreFinder {
    public Optional<Double> findFor(List<HappinessRecord> list, String country) {
        for (HappinessRecord happinessRecord : list) {
            if (happinessRecord.getCountry().equals(country)) {
                return Optional.of(happinessRecord.getScore());
            }
        }
        return Optional.empty();
    }
}
