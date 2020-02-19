package academy.everyonecodes.java.week9.set2.exercise2.Player;

import academy.everyonecodes.java.week9.set2.exercise2.Moves.Move;

public interface Player {

    Move chooseMove();

    boolean wantsToPlayAgain();
}
