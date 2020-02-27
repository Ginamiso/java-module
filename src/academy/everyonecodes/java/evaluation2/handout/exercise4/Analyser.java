package academy.everyonecodes.java.evaluation2.handout.exercise4;

import java.util.List;
import java.util.stream.Collectors;

public class Analyser {

    List<AvocadoAnalyser> analysers = List.of(new LowestAveragePriceAnalyser(), new RegionOfMostSoldOrganicAnalyser());

    public List<String> analyse(List<AvocadoEntry> entries) {
        return analysers.stream()
                .map(avocadoAnalyser -> avocadoAnalyser.analyse(entries))
                .collect(Collectors.toList());
    }
}
