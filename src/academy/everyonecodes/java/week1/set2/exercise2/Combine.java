package academy.everyonecodes.java.week1.set2.exercise2;

import java.util.List;
import java.util.ArrayList;

public class Combine {

    public static List<String> combine(List<String> first, List<String> second) {
        List<String> combinedElements = new ArrayList<>();

        while (first.size() > 0 || second.size() > 0) {
            if (first.size() > 0) {
                String element = first.get(0);
                combinedElements.add(element);
                first.remove(0);
            }
            if (second.size() > 0) {
                String elementTwo = second.get(0);
                combinedElements.add(elementTwo);
                second.remove(0);
            }
        }
        return combinedElements;
    }

    public static void main(String[] args) {
        List<String> firstElements = new ArrayList<>();
        firstElements.add("one");
        firstElements.add("three");
        firstElements.add("five");
        List<String> secondElements = new ArrayList<>();
        secondElements.add("two");
        secondElements.add("four");
        List<String> combinedElements = combine(firstElements, secondElements);
        for (String element : combinedElements) {
            System.out.println(element);
        }
    }
}
