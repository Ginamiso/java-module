package academy.everyonecodes.java.week5.reflection.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LinesCalculator {

    public List<String> calculate(String input) {
        StringToIntegersParser parser = new StringToIntegersParser();
        List<Integer> numbers = parser.parse(input);
        IntegerListSumCalculator sumCalculator = new IntegerListSumCalculator();
        Optional<Integer> sum = sumCalculator.sum(numbers);
        List<String> sumAsString = new ArrayList<>();
        if (sum.isPresent()) {
            int number = sum.get();
            try {
                String string = String.valueOf(number);
                sumAsString.add(string);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return new ArrayList<>();
            }


        }
        return sumAsString;
    }
}
