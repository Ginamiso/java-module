package academy.everyonecodes.java.week4.set2.exercise2;

import java.util.List;

public class LineSumCalculator {

    private StringAsIntegerListParser stringAsIntegerListParser = new StringAsIntegerListParser();
    public int calculate(String string) {

        List<Integer> listOfIntegers = stringAsIntegerListParser.parse(string);
        int result = 0;
        for(int number : listOfIntegers){
            result = result + number;
        }
        return result;
    }
}
