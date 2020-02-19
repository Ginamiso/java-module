package academy.everyonecodes.java.week9.set2.exercise2.Player;

public class Players {

    public static Player getPlayer1(){
        return new Human();
    }
    public static Player getPlayer2(){
        return new Computer();
    }
}
