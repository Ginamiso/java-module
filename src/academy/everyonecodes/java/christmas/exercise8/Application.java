package academy.everyonecodes.java.christmas.exercise8;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Incrementer incrementer = new Incrementer();
        List<Integer> numbers = List.of(1, 2, 2, 4, 5, 6);
        List<Integer> incremented = incrementer.incrementByOne(2, numbers);
        System.out.println(incremented);

    }
}
