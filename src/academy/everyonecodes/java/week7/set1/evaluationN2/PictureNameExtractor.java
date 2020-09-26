package academy.everyonecodes.java.week7.set1.evaluationN2;

import java.util.List;
import java.util.stream.Collectors;

public class PictureNameExtractor {
    public List<String> extract(List<String> files) {
        return files.stream()
                .map(name -> name.substring(8, name.length() -7))
                .map(String::toLowerCase)
                .map(name-> name.replaceAll("-", " "))
                .collect(Collectors.toList());
    }
}
