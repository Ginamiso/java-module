package academy.everyonecodes.java.week1.reflection.exercise1;

public class Power {
    public static int raiseToPower(int number, int power){
        int result = 1;
        while(power != 0){
            result = result*number;
            power--;
        }
        return result;
    }public static void main(String[] args){
        int number = 0;
        int power = 0;
        int result = raiseToPower(number, power);
        System.out.println(result);
    }
}
