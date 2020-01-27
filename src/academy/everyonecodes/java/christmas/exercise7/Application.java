package academy.everyonecodes.java.christmas.exercise7;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Reverser reverser = new Reverser();
        IntegerListPrinter integerListPrinter = new IntegerListPrinter();
        List<Integer> numbers = List.of(1,2,3,4);
        List<Integer> reversedNumbers = reverser.reverse(numbers);
        integerListPrinter.print(numbers);
        integerListPrinter.print(reversedNumbers);
     }
}
