package academy.everyonecodes.java.optionals.arrays.exercise2;
import java.util.Scanner;
public class TicTacToe {
    public String[][] getEmptyGameField(){
        String[][] field = new String[3][3];
        for(int i=0; i<field.length; i++){
            for(int j=0; j<field.length; j++){
                field[i][j] = "[ ]";
            }
        }
    return field;
    }
    public void printGameField(String[][] field){
        for(int i=0; i<field.length; i++){
            for(int j=0; j<field.length; j++){
                System.out.print(field[i][j]+"\t");
            }
            System.out.print("\n");

        }
    }
    public void playOneRound(String[][] field, String name, String symbol){
        System.out.println(name + ", what is your next move?");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        field[row][column] = "["+symbol+"]";
        printGameField(field);



    }
}
