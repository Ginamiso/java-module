package academy.everyonecodes.java.week1.set1.exercise2;

public class Sum {
    public static int sumInt(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
    public static double sumDouble(double numberOne, double numberTwo){
        return numberOne + numberTwo;
    }
    public static void main(String[] args) {
        int numberOne = 3;
        int numberTwo = 7;
        int sumInt = sumInt(numberOne, numberTwo);
        System.out.println("The result is " + sumInt);
        double numberThree = 2.5;
        double numberFour = 3.7;
        double sumDouble = sumDouble(numberThree, numberFour);
        System.out.println("The result is " + sumDouble);
    }
}
