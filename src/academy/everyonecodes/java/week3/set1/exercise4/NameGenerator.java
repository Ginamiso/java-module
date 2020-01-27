package academy.everyonecodes.java.week3.set1.exercise4;

public class NameGenerator {
    public String generateNewName(String name) {

        return name.substring(0, name.length() - 3) + "png";
    }
}
