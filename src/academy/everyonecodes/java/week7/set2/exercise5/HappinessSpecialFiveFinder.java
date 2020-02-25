package academy.everyonecodes.java.week7.set2.exercise5;

import academy.everyonecodes.java.week5.set2.exercise4.HappinessRecord;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HappinessSpecialFiveFinder {
    HappinessDataReader reader = new HappinessDataReader();
    public List<String> find() {
        List<HappinessRecord> records = reader.read();

        List<String> specialFive = records.stream()
                .sorted(Comparator.comparing(HappinessRecord::getRank).reversed())
                .filter(country -> country.getCountry().contains("a")&&country.getCountry().length() > 9)
                .limit(5)
                .sorted(Comparator.comparing(HappinessRecord::getRank))
                .map(country -> "Country: "+country.getCountry() + " Rank: "+country.getRank())
                .collect(Collectors.toList());

        return specialFive;

    }
}
