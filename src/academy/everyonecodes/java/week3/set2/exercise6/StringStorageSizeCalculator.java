package academy.everyonecodes.java.week3.set2.exercise6;

public class StringStorageSizeCalculator {
    public int calculate(String word) {
        int wordBits = (word.length()*2)*8;
        int hashCode = 32;
        return wordBits+hashCode;
    }
}
