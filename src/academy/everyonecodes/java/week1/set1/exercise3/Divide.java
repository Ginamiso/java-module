package academy.everyonecodes.java.week1.set1.exercise3;

public class Divide {
    public static double divide(double numberOne, double numberTwo){
        return numberOne/numberTwo;
    }
    public static void main(String[] args){
        double numberOne = 27.8;
        double numberTwo = 3.3;
        double result = divide(numberOne, numberTwo);
        System.out.println("The quotient is " + result);
    }
}
