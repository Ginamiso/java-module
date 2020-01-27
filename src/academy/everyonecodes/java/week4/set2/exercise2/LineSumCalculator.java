package academy.everyonecodes.java.week4.set2.exercise2;

import academy.everyonecodes.java.week1.set1.exercise2.Sum;

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
