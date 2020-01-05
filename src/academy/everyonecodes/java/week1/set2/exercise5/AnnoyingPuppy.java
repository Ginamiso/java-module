package academy.everyonecodes.java.week1.set2.exercise5;
import java.util.Scanner;
public class AnnoyingPuppy {
    public static boolean isAtHome(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are we at home?");
        return scanner.nextBoolean();
    }
    public static void greetSomeone(){
        boolean isAtHome = isAtHome();
        System.out.println("Woof is this person's name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if((!isAtHome && name.equals("Derek") || name.equals("Hansel") || name.equals("Matilda")) || isAtHome){
            System.out.println("Hi, there, "+name);
        }

    }
    public static void main(String[] args){
        greetSomeone();
    }
}
