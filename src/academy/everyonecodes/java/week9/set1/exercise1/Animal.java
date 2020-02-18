package academy.everyonecodes.java.week9.set1.exercise1;

import java.util.List;

public class Animal {
    private String name;
    private List<String> movements;
    private String kind;

    public Animal(String name, List<String> movements, String kind) {
        this.name = name;
        this.movements = movements;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public List<String> getMovement() {
        return movements;
    }

    public String getKind() {
        return kind;
    }
}
