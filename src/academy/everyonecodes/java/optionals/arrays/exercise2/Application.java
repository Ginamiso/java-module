package academy.everyonecodes.java.optionals.arrays.exercise2;

public class Application {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        String[][]field = ticTacToe.getEmptyGameField();
        ticTacToe.playOneRound(field, "guy", "x");
    }
}