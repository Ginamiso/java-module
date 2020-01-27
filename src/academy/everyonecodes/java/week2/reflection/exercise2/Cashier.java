package academy.everyonecodes.java.week2.reflection.exercise2;

import academy.everyonecodes.java.week2.reflection.exercise1.Cart;
import academy.everyonecodes.java.week2.reflection.exercise1.CartItem;
import academy.everyonecodes.java.week2.reflection.exercise1.Product;

public class Cashier {
    public void billCustomer(Cart cart){
        double total = 0;
        for(CartItem cartItem : cart.getCartItems()){
            int amount = cartItem.getAmount();
            Product product = cartItem.getProduct();
            double pricePerUnit = product.getPricePerUnit();

            double priceForCartItem = pricePerUnit*amount;

            total = total + priceForCartItem;

        }
        System.out.println(cart.getName()+" has to pay "+total+" Euros.");
    }
}
