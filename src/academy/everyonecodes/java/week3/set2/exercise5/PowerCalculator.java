package academy.everyonecodes.java.week3.set2.exercise5;

public class PowerCalculator {
    public static double calculate(double number, int power) {
        if (number == 0) {
            return 0;
        }

        double result = 1;
        for (int i = 0; i < power; i++) {
            result = result * number;
        }
        return result;

    }
}