package academy.everyonecodes.java.week1.set2.exercise3;

import java.util.List;
import java.util.ArrayList;

public class BiggerSmaller {
    public static boolean isBigger(int first, int second) {
        return first > second;
    }

    public static boolean isSmaller(int first, int second) {
        return first < second;
    }

    public static int getBiggest(List<Integer> numbers) {
        int biggest = numbers.get(0);
        for (Integer number : numbers) {
            if (isBigger(number, biggest)) {
                biggest = number;
            }
        }
        return biggest;

    }

    public static int getSmallest(List<Integer> numbers) {
        int smallest = numbers.get(0);
        for (Integer number : numbers) {
            if (isSmaller(number, smallest)) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-1, 4, 3, 0, 5, 2);
        int biggest = getBiggest(numbers);
        int smallest = getSmallest(numbers);
        System.out.println("The biggest number is " + biggest);
        System.out.println("The smallest number is " + smallest);


    }
}
