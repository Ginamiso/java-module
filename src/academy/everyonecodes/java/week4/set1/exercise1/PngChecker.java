package academy.everyonecodes.java.week4.set1.exercise1;

public class PngChecker {
    public boolean check(String fileName) {
        String lowerCase = fileName.toLowerCase();
        return lowerCase.endsWith(".png");
    }
}
