package academy.everyonecodes.java.week4.examples.exercise1;

public class StringValidator {
    public boolean validate(String input) {
        String trimmed = input.trim();
        if(!trimmed.isEmpty()){
            return true;
        }
        return false;
    }
}
