package academy.everyonecodes.java.week9.set1.exercise1;

import java.util.List;

public class Reptile extends Animal {
     private boolean hasShall;

    public Reptile(String name, List<String> movements, boolean hasShall) {
        super(name, movements, "reptile");
        this.hasShall = hasShall;
    }

    public boolean hasShall() {
        return hasShall;
    }
}
