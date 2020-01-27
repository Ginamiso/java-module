package academy.everyonecodes.java.week4.examples.exercise1;

public class StringValidator {
    public boolean validate(String input) {
        if(input.contains(" ")){
            return false;
        }
        return true;
    }
}
