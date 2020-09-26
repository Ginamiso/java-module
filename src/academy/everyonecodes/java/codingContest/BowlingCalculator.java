package academy.everyonecodes.java.codingContest;

import java.util.List;

public class BowlingCalculator {
    private PointsCounter counter = new PointsCounter();

    public String result(String input) {
        List<Integer> points = counter.parsePoints(input);
        int rounds = counter.parseRound(input);

        int total = 0;
        String output = "";

        int throwCounter = 0;
        int roundCounter = 0;

        while (roundCounter < rounds) {
            if (roundCounter != 0) {
                output = output + ",";
            }
            int roundScore;
            if (points.get(throwCounter) == 10) {
                roundScore = 10 + points.get(throwCounter + 1) + points.get(throwCounter + 2);
                throwCounter++;
            } else {
                roundScore = points.get(throwCounter) + (points.get(throwCounter + 1));
                if (roundScore == 10) {
                    roundScore += points.get(throwCounter + 2);
                }
                throwCounter += 2;
            }
            int scoreToAdd = total + roundScore;
            output = output + scoreToAdd;
            roundCounter++;
            total = scoreToAdd;
        }
        System.out.println(output);
        return output;

    }
}
