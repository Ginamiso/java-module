package academy.everyonecodes.java.optionals.sets.exercise2;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class BasicDictionary {
    private Set<String> dictionary;

    public BasicDictionary() {
        dictionary = Set.of(
                "hi",
                "house",
                "dog",
                "cat",
                "table",
                "chair",
                "elephant");
    }

    public List<String> findUnknownWords(String text) {
        LinkedHashSet<String> unknownWords = new LinkedHashSet<>();
        List.of(text.split(" ")).stream()
                .map(String::toLowerCase)
                .filter(word -> !dictionary.contains(word) && !word.isBlank())
                .forEach(word -> unknownWords.add(word));
        return new ArrayList<>(unknownWords);
    }
}

