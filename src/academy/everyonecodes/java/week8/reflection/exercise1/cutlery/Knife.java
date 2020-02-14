package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

public class Knife implements Cutlery {
    @Override
    public String getName() {
        return "Knife";
    }

    @Override
    public boolean isUsedFor(String dish) {
        return dish.equalsIgnoreCase("Fish")||dish.equalsIgnoreCase("Pizza");
    }
}
