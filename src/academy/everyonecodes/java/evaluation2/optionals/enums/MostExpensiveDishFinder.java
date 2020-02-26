package academy.everyonecodes.java.evaluation2.optionals.enums;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MostExpensiveDishFinder {

    public List<Dish> find(List<Dish> dishes) {
        List<Dish> mostExpensiveDishes = new ArrayList<>();
        Optional<Dish> mostExpensiveStarter = dishes.stream()
                .filter(dish -> dish.getCategory().equals(Category.STARTER))
                .sorted(Comparator.comparing(Dish::getPrice).reversed())
                .findFirst();
        if (mostExpensiveStarter.isPresent()) {
            mostExpensiveDishes.add(mostExpensiveStarter.get());
        }
        Optional<Dish> mostExpensiveMain = dishes.stream()
                .filter((dish -> dish.getCategory().equals(Category.MAIN_DISH)))
                .sorted(Comparator.comparing(Dish::getPrice).reversed())
                .findFirst();
        if (mostExpensiveMain.isPresent()) {
            mostExpensiveDishes.add(mostExpensiveMain.get());
        }
        Optional<Dish> mostExpensiveDessert = dishes.stream()
                .filter((dish -> dish.getCategory().equals(Category.DESSERT)))
                .sorted(Comparator.comparing(Dish::getPrice).reversed())
                .findFirst();
        if (mostExpensiveDessert.isPresent()) {
            mostExpensiveDishes.add(mostExpensiveDessert.get());
        }
        return mostExpensiveDishes;
    }
}
