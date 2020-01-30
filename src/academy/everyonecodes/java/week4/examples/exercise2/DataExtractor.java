package academy.everyonecodes.java.week4.examples.exercise2;

public class DataExtractor {
    public String extract(String file) {
        int length = file.length();
        String extraction = file.substring(6,length - 4);
        return extraction;
    }
}
