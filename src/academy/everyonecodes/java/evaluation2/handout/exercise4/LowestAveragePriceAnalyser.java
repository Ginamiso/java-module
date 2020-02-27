package academy.everyonecodes.java.evaluation2.handout.exercise4;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LowestAveragePriceAnalyser implements AvocadoAnalyser {

    @Override
    public String analyse(List<AvocadoEntry> avocadoEntries) {
        Optional<AvocadoEntry> oResult = avocadoEntries.stream()
                .sorted(Comparator.comparing(AvocadoEntry::getAveragePrice))
                .findFirst();
        if (oResult.isPresent()) {
            AvocadoEntry result = oResult.get();
            return "Lowest average price is: " + result.getAveragePrice() + " on " + result.getYear();
        } else {
            return "Lowest average price is: Result not found";
        }
    }
}
