package academy.everyonecodes.java.week2.reflection.exercise2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import academy.everyonecodes.java.week2.reflection.exercise1.Cart;
import academy.everyonecodes.java.week2.reflection.exercise1.CartItem;
import academy.everyonecodes.java.week2.reflection.exercise1.Product;

public class ShopAssistant {
    public Cart walkThroughShop(String name){
        List<CartItem> cartItems = new ArrayList<>();
        System.out.println("Hello "+name+", welcome to our shop!");
        System.out.println("What do you want to buy?");
        Scanner scanner = new Scanner(System.in);
        String nameOfProduct = scanner.nextLine();
        while(!nameOfProduct.equals("")){
            System.out.println("How much does it cost?");
            double pricePerUnit = scanner.nextDouble();
            scanner.nextLine();
            Product product = new Product(nameOfProduct,pricePerUnit);
            System.out.println("How many do you want?");
            int amount = scanner.nextInt();
            scanner.nextLine();
            CartItem cartItem = new CartItem(product, amount);
            cartItems.add(cartItem);
            System.out.println("Thank you we will put that in the cart!");
            System.out.println("What do you want to buy?");
            nameOfProduct = scanner.nextLine();

        }
        System.out.println("Thank you for shopping with us!");
        Cart cart = new Cart(cartItems, name);
        return cart;

    }
}
