package academy.everyonecodes.java.week1.set1.exercise4;

public class WateringMachines {
    public static int calculateWateringMachines(int numberOfMachinesOwned, int numberOfPlants){
        int plantsWatered = 4;
        int numberOfMachinesToBuy = (numberOfPlants/plantsWatered) - numberOfMachinesOwned;
        return numberOfMachinesToBuy;
    }
    public static double calculatePrice(int numberOfMachinesToBuy, double price, double discount){
        double discountedPrice = price - (price * discount);
        return numberOfMachinesToBuy * discountedPrice;
    }
    public static void main(String[] args){
        int numberOfMachinesOwned = 1;
        int numberOfPlants = 9+3;
        int price = 20;
        double discount = 0.20;
        int numberOfMachinesToBuy = calculateWateringMachines(numberOfMachinesOwned, numberOfPlants);
        double finalPrice = calculatePrice(numberOfMachinesToBuy, price, discount);
        System.out.println("The final price is " + finalPrice);
    }


}
