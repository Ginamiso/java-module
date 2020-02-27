package academy.everyonecodes.java.evaluation2.handout.exercise4;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class RegionOfMostSoldOrganicAnalyser implements AvocadoAnalyser {


    @Override
    public String analyse(List<AvocadoEntry> avocadoEntries) {
        Optional<AvocadoEntry> oResult = avocadoEntries.stream()
                .filter(avocadoEntry -> avocadoEntry.getType().equals("organic"))
                .filter(avocadoEntry -> !avocadoEntry.getRegion().equals("TotalUS"))
                .sorted(Comparator.comparing(AvocadoEntry::getTotalSold).reversed())
                .findFirst();
        if (oResult.isPresent()) {
            AvocadoEntry result = oResult.get();
            return "Region of most sold organic is: " + result.getRegion() + " with " + result.getTotalSold();
        }
        return "Region of most sold organic is: Result not found";
    }
}

