package academy.everyonecodes.java.week4.set2.exercise1;

public class StringCapitalizer {

    public String capitalize(String word) {
        if (word.length() > 0) {
            String firstLetter = word.substring(0,1);
            firstLetter = firstLetter.toUpperCase();
            String rest = word.substring(1, word.length());
            rest = rest.toLowerCase();
            return firstLetter + rest;

        } else {
            return word;
        }
    }
}
