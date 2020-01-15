package academy.everyonecodes.java.week4.set2.exercise4;

import academy.everyonecodes.java.week4.set2.exercise3.DoubleListMedianCalculator;

import java.util.ArrayList;
import java.util.List;

public class DoubleListFromMedianSubtractor {
    public List<Double> calculate(List<Double> doubles) {
        DoubleListMedianCalculator doubleListMedianCalculator = new DoubleListMedianCalculator();
        double median = doubleListMedianCalculator.calculate(doubles);
        List<Double> medianSubtractorList = new ArrayList<>();
        double result = 0;
        for(double number : doubles) {
            result = number - median;
            medianSubtractorList.add(result);
        }
        return medianSubtractorList;

    }
}
