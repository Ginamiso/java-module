package academy.everyonecodes.java.week3.reflection;

import java.util.List;

public class DoubleListSumCalculator {
    public double calculate(List<Double> decimals) {
        double sum = 0;
        for(double number : decimals){
            sum = sum+number;
        }
        return sum;
    }
}
