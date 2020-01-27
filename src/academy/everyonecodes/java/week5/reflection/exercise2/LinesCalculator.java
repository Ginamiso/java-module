package academy.everyonecodes.java.week5.reflection.exercise2;

import java.util.ArrayList;
import java.util.List;


public class LinesCalculator {

    StringToIntegersParser parser = new StringToIntegersParser();
    IntegerListSumCalculator sumCalculator = new IntegerListSumCalculator();

    public List<String> calculate(List<String> input) {

        List<String> sumsAsString = new ArrayList<>();

        for (String string : input) {
            List<Integer> numbers = parser.parse(string);
            int sum = sumCalculator.sum(numbers);

            String numberToString = String.valueOf(sum);
            sumsAsString.add(numberToString);
        }

        return sumsAsString;
    }
}
