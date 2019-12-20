package academy.everyonecodes.java.week2.reflection.exercise1;

public class Application {
    public static void main(String[] args) {
        Product spaghetti = new Product("Spaghetti", 3.8);
        Product tomato = new Product("tomato", 1.3);
        tomato.setPricePerUnit(0.8);
        CartItem cart1 = new CartItem(spaghetti, 3);
        CartItem cart2 = new CartItem(tomato, 5);
        cart1.setAmount(14);

    }
}
