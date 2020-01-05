package academy.everyonecodes.java.christmas.exercise7;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Reverser reverser = new Reverser();
        List<Integer> numbers = List.of(1,2,3,4);
        List<Integer> reversedNumbers = reverser.reverse(numbers);
        for(int number : numbers){
            System.out.println(number);
        }
        for(int number2 : reversedNumbers){
            System.out.println(number2);
        }
     }
}
