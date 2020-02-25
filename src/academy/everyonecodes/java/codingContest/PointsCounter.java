package academy.everyonecodes.java.codingContest;

import java.util.List;
import java.util.stream.Collectors;

public class PointsCounter {

    public int parseRound(String points) {
        List<String> parsedPoints = List.of(points.split(","));
        String first = parsedPoints.get(0);
        List<String> parsedFirst = List.of(first.split(":"));
        int rounds = Integer.valueOf(parsedFirst.get(0));
        return rounds;
    }

    public List<Integer> parsePoints(String points) {

        List<String> parsedFirst = List.of(points.split(":"));
        String scores = parsedFirst.get(1);
        List<String> parsedPoints = List.of(scores.split(","));
        return parsedPoints.stream()
                .map(score -> Integer.valueOf(score))
                .collect(Collectors.toList());



    }
}





