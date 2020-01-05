package academy.everyonecodes.java.christmas.exercise10;

public class Application {
    public static void main(String[] args) {
        AgeAsker ageAsker = new AgeAsker();
        HatChecker hatChecker = new HatChecker();
        PasswordAsker passwordAsker = new PasswordAsker();
        boolean age = ageAsker.isAdult();
        boolean hat = hatChecker.isWearingAHat();
        boolean password = passwordAsker.knowsSecretPassword();
        if(age && hat && password){
            System.out.println("You can enter our club.");
        }else{
            System.out.println("I'm sorry but you cannot enter our club.");
        }
    }
}
