package academy.everyonecodes.java.optionals.maps.exercise1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringToLengthMapper {
    public Map<String, Integer> map(List<String> words){
         return  words.stream()
                 .collect(Collectors.toMap(key -> key, String::length));
     }
}
