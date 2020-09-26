package academy.everyonecodes.java.week3.set2.exercise5;

public class PowerCalculator {

    public double calculate(double base, int power) {
        if (base == 0) {
            return 0;
        }
        double result = 1;
        if (power < 0) {
            power = power * -1;
            base = 1 / base;
        }
        for (int i = 0; i < power; i++) {
            result = result * base;
        }
        return result;

    }
}