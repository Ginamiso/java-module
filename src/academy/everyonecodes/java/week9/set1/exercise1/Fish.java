package academy.everyonecodes.java.week9.set1.exercise1;

import java.util.List;

public class Fish extends Animal {
    private String waterKind;

    public Fish(String name, List<String> movements, String waterKind) {
        super(name, movements, "fish");
        this.waterKind = waterKind;
    }

    public String getWaterKind() {
        return waterKind;
    }
}
