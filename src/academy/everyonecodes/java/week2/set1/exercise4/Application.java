package academy.everyonecodes.java.week2.set1.exercise4;
import java.util.List;
import java.util.ArrayList;
public class Application {
    public static void explain(Menu menu){
        for(Dish dish : menu.getDishes()){
            System.out.println(dish.getName() + " for " + dish.getPrice() + " Euro.");
        }

    }

    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList<>();
        Dish pizza = new Dish("Pizza", 7);
        Dish lasagna = new Dish("Lasagna", 10);
        Dish pasta = new Dish("Pasta", 6.50);
        dishes.add(pizza);
        dishes.add(lasagna);
        dishes.add(pasta);
        Menu menu = new Menu("Casa Mia", dishes);
        explain(menu);
    }
}
