package academy.everyonecodes.java.evaluation2.optionals.maps;

import java.util.HashMap;
import java.util.Map;

public class ScoreCounter {

    private Map<String, Integer> points = new HashMap<>();

    public void saveRoundWinner(String winner) {
        points.put(winner, 1);
    }

    public String getWinner() {
        return "I dont know";


    }
}
