package academy.everyonecodes.java.week1.set1.exercise3;

public class Divide {
    public static double divide(double dividend, double divisor){
        return dividend/divisor;
    }
    public static void main(String[] args){
        double dividend = 0;
        double divisor = 3.0;
        double quotient = divide(dividend, divisor);
        System.out.println("The quotient is " + quotient);
    }
}
