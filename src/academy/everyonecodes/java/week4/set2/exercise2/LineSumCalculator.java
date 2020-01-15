package academy.everyonecodes.java.week4.set2.exercise2;

import java.util.List;

public class LineSumCalculator {
    public int calculate(String string) {
        StringAsIntegerListParser stringAsIntegerListParser = new StringAsIntegerListParser();
        List<Integer> listOfIntegers = stringAsIntegerListParser.parse(string);
        int result = 0;
        for(int number : listOfIntegers){
            result = result + number;
        }
        return result;
    }
}
