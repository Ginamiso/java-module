package academy.everyonecodes.java.week6.set2.exercise4;

import academy.everyonecodes.java.week5.reflection.exercise2.IntegerListSumCalculator;

import java.util.ArrayList;
import java.util.List;

public class DigitSumCalculator {

    private IntegerListSumCalculator calculator = new IntegerListSumCalculator();

    public int calculate(int number) {
        String numberAsString = String.valueOf(number);
        List<String> listOfNumbers = List.of(numberAsString.split(""));
        List<Integer> numbers = new ArrayList<>();
        for(String string : listOfNumbers){
            int stringIntoNumber = Integer.valueOf(string);
            numbers.add(stringIntoNumber);
        }
        int digitSum = calculator.sum(numbers);
        return digitSum;
    }
}
