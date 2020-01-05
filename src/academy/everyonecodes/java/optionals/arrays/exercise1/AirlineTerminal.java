package academy.everyonecodes.java.optionals.arrays.exercise1;
import java.util.Scanner;
public class AirlineTerminal {
    private String[] getItems(){
        String[] items = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please tell me your 5 items");
        for(int i = 0; i<items.length; i++){
            items[i] = scanner.nextLine().toLowerCase();
        }
        return items;
    }
    private boolean isAnItemSuspicious(String[] items){
        for(String item : items){
            if(item.equals("bomb")){
                return true;
            }
        }return false;
    }
    public void doPassengerCheckIn(){
        System.out.println("WELCOME TO EC AIRLINES!");
        String[] items = getItems();
        System.out.println("Thank you for boarding, we will check your items.");
        boolean isSuspicious = isAnItemSuspicious(items);
        if (isSuspicious){
            System.out.println("Sorry we cannot allow you to proceed.");

        }else{
            System.out.println("All items are good to go. Enjoy your flight!");
        }

    }
}
