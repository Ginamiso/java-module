package academy.everyonecodes.java.week8.set2.exercise3;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args) {
        System.out.println("what is your operation?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        List<String> list = List.of(answer.split(" "));
        int number1 = Integer.parseInt(list.get(0));
        int number2 = Integer.parseInt(list.get(2));
        String symbol = list.get(1);
        Calculation calculation = new Calculation(symbol, number1, number2);
        Calculator calculator = new Calculator();
        Optional<Double> oResult = calculator.calculate(calculation);
        if (oResult.isEmpty()) {
            System.out.println("Solution: operation not available");
        } else {
            System.out.println("Solution: " + oResult.get());
        }
    }
}
