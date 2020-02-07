package academy.everyonecodes.java.week7.reflection.exercise1;

import academy.everyonecodes.java.week7.set2.exercise4.StreamFileReader;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Top5ParentalEducationFinder {
    private StudentPerformanceReader reader = new StudentPerformanceReader();

    public List<String> find() {
        return reader.read().stream()
                .sorted(Comparator.comparing(StudentPerformance::getMathScore).reversed())
                .limit(5)
                .map(performance -> performance.getParentalEducation())
                .collect(Collectors.toList());
    }
}
