package academy.everyonecodes.java.optionals.arrays.exercise2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TicTacToe {
    private String[][] getEmptyGameField(){
        String[][] field = new String[3][3];
        for(int i=0; i<field.length; i++){
            for(int j=0; j<field.length; j++){
                field[i][j] = "[ ]";
            }
        }
    return field;
    }
    private void printGameField(String[][] field){
        for(int i=0; i<field.length; i++){
            for(int j=0; j<field.length; j++){
                System.out.print(field[i][j]);
            }
            System.out.println("");

        }
    }
    private void playOneRound(String[][] field, String name, String symbol){
        System.out.println(name + ", what is your next move?");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        scanner.nextLine();
        int column = scanner.nextInt();
        scanner.nextLine();
        field[row][column] = "["+symbol+"]";
        printGameField(field);
    }
    public void play(){
        String [][] field = getEmptyGameField();
        System.out.println("Player one, what's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Player two, what's your name?");
        String name2 =scanner.nextLine();
        List<String> players = new ArrayList<>();
        players.add(name);
        players.add(name2);
        List<String> symbols = new ArrayList<>();
        symbols.add("x");
        symbols.add("o");
        boolean isOver = false;
        while(!isOver){
            String player = players.get(0);
            String symbol = symbols.get(0);
            playOneRound(field, player, symbol);
            players.remove(player);
            symbols.remove(symbol);
            players.add(player);
            symbols.add(symbol);
            System.out.println("Is the game over? (y/n)");
            String answer = scanner.nextLine();
            if(answer.equals("y")){
                isOver = true;
            }else{
                isOver = false;
            }
            if (isOver){
                System.out.println("Congratulations " +player+" you won!");
            }
        }
    }
}
