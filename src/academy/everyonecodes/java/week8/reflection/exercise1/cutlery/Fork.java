package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

public class Fork implements Cutlery {
    @Override
    public String getName() {
        return "Fork";
    }

    @Override
    public boolean isUsedFor(String dish) {
        return (dish.equalsIgnoreCase("Fish") || dish.equalsIgnoreCase("Pizza") || dish.equalsIgnoreCase("Pasta")) ;
        }
    }
