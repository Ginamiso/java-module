package academy.everyonecodes.java.week4.set2.exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoubleListMedianCalculator {

    public double calculate(List<Double> listOfDouble) {
        ArrayList<Double> doubleCopy = new ArrayList<>(listOfDouble);
        Collections.sort(doubleCopy);
        if(doubleCopy.size() == 0)
            return -1;
        if(doubleCopy.size() % 2 == 0) {
            int halfSize = doubleCopy.size()/2;
            double index1 = doubleCopy.get(halfSize -1);
            double index2 = doubleCopy.get(halfSize);
            return (index1+index2)/2.0;
        }else{
            int index = (int) doubleCopy.size()/2;
            double median = doubleCopy.get(index);
            return median;

        }
    }
}
