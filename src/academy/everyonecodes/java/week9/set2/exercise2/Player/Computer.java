package academy.everyonecodes.java.week9.set2.exercise2.Player;

import academy.everyonecodes.java.week9.set2.exercise2.Moves.Move;
import academy.everyonecodes.java.week9.set2.exercise2.Moves.Moves;

import java.util.List;
import java.util.Random;

public class Computer implements Player {

    private List<Move> moves = Moves.get();
    private Random random = new Random();

    @Override
    public Move chooseMove() {
        return moves.get(random.nextInt(moves.size()));
    }

    @Override
    public boolean wantsToPlayAgain() {
        return true;
    }
}
