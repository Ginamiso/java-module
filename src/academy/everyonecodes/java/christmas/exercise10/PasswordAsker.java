package academy.everyonecodes.java.christmas.exercise10;

import java.util.Scanner;

public class PasswordAsker {
    public boolean knowsSecretPassword(){
        System.out.println("What's the secret password?");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine().toLowerCase();
        return password.equals("hokopoko");

    }
}
