package academy.everyonecodes.java.week2.set1.exercise3;
import java.util.List;
public class Application {
    public static void main(String[] args) {
        String name = "Pizza";
        int time = 30;
        List<String> ingredients = List.of("Flour", "Water", "Salt", "Yeast");
        List<String> steps = List.of("mix", "bake", "eat");
        Recipe pizza = new Recipe(name, time, ingredients, steps);
    }
}
