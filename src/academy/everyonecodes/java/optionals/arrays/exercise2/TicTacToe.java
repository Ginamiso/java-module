package academy.everyonecodes.java.optionals.arrays.exercise2;

import java.util.List;
import java.util.Scanner;

public class TicTacToe {

    private String[][] getEmptyGameField() {
        String[][] field = new String[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = "[ ]";
            }
        }
        return field;
    }

    private void printGameField(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println("");
        }
    }

    public void playOneRound(String[][] field, String name, String symbol) {
        System.out.println(name + ", what is your next move?");
        boolean isValid = true;
        while (isValid) {
            Scanner scanner = new Scanner(System.in);
            int row = scanner.nextInt();
            scanner.nextLine();
            int column = scanner.nextInt();
            scanner.nextLine();
            List<Integer> possibleInputs = List.of(0, 1, 2);
            if (possibleInputs.contains(row) && possibleInputs.contains(column)) {
                field[row][column] = "[" + symbol + "]";
                printGameField(field);
            } else {
                System.out.println("Invalid move, please type again");
                isValid = true;
            }
        }
    }
}

