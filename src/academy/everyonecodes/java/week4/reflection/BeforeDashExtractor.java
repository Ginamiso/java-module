package academy.everyonecodes.java.week4.reflection;

import java.util.List;

public class BeforeDashExtractor {
    public String extract(String string) {
        if (!string.contains("-")) {
            return "";
        }
        List<String> parts = List.of(string.split("-"));
        return parts.get(0);
    }
}
