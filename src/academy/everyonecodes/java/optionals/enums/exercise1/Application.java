package academy.everyonecodes.java.optionals.enums.exercise1;

public class Application {
    public static void main(String[] args) {
        Shop shop = new Shop();
        ShopAssistant shopAssistant = new ShopAssistant(shop);
        shopAssistant.dealWithCustomer();
    }
}
