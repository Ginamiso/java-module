package academy.everyonecodes.java.week9.set1.exercise1;


import java.util.List;

public class Mammal extends Animal {

    private String hairColor;


    public Mammal(String name, List<String> movements, String hairColor) {
        super(name, movements, "mammal");
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }
}
