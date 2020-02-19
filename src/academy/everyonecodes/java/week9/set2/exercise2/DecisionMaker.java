package academy.everyonecodes.java.week9.set2.exercise2;

import academy.everyonecodes.java.week9.set2.exercise2.Moves.Move;

public class DecisionMaker {

    public String decide(Move move1, Move move2) {
        if (move1.defeats(move2)) {
            return "Player 1 wins";
        }
        if (move2.defeats(move1)) {
            return "Player 2 wins";
        }
        return "Nobody wins";
    }
}
        //    private Map<String, String> rules = Map.of(
//            "rock", "scissors",
//            "scissors", "paper",
//            "paper", "rock");
//
//        if (move1.getName().equalsIgnoreCase(move2.getName())) {
//            return "Nobody wins!";
//        }
//        String desiredPlayer2MoveName = rules.get(move1.getName());
//        if (move2.equals(desiredPlayer2MoveName)) {
//            return "Player 1 wins";
//        }
//        return "Player 2 wins";
//