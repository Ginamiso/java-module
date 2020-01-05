package academy.everyonecodes.java.christmas.exercise9;

public class NameGenerator {
    public String generateNewName(String name){
        int length = name.length();
        String newName = name.substring(0,length-3) + "png";
        return newName;
    }
}
