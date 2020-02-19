package academy.everyonecodes.java.week9.set2.exercise2;

import academy.everyonecodes.java.week9.set2.exercise2.Moves.Move;
import academy.everyonecodes.java.week9.set2.exercise2.Player.Player;
import academy.everyonecodes.java.week9.set2.exercise2.Player.Players;

public class RockScissorPaperGame {

    private Player player1 = Players.getPlayer1();
    private Player player2 = Players.getPlayer2();
    private DecisionMaker decisionMaker = new DecisionMaker();

    public void play() {
        boolean wantToPlay = true;
        while (wantToPlay) {
            System.out.println("Let's play rock, paper, scissors!");
            playOneRound(player1, player2);
            wantToPlay = askToPlayAgain(player1, player2);
        }
        System.out.println("See you");
    }

    private boolean askToPlayAgain(Player player1, Player player2) {
        return player1.wantsToPlayAgain() && player2.wantsToPlayAgain();

    }

    private void playOneRound(Player player1, Player player2) {
        Move move1 = player1.chooseMove();
        System.out.println("Player 1 chose: " + move1.getName());
        Move move2 = player2.chooseMove();
        System.out.println("Player 2 chose: " + move2.getName());
        String result = decisionMaker.decide(move1, move2);
        System.out.println(result);
    }
}
