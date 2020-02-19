package academy.everyonecodes.java.week9.set2.exercise2.Player;

import academy.everyonecodes.java.week9.set2.exercise2.Moves.Move;
import academy.everyonecodes.java.week9.set2.exercise2.Moves.Moves;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Human implements Player {

    private List<Move> moves = Moves.get();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Move chooseMove() {
        Optional<Move> oMove = Optional.empty();
        while (oMove.isEmpty()) {
            oMove = askForMove();
        }
        return oMove.get();
    }

    private Optional<Move> askForMove() {
        System.out.println("Choose one move. Available options: "+getMoveNames());
        String randomMove = scanner.nextLine();
        return moves.stream()
                .filter(move -> move.getName().equalsIgnoreCase(randomMove))
                .findFirst();
    }

    private String getMoveNames() {
        return moves.stream()
                .map(Move::getName)
                .collect(Collectors.joining(","));
    }

    @Override
    public boolean wantsToPlayAgain() {
        System.out.println("Do you want to play again? (y,n)");
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase("y");
    }

}



