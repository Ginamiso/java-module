package academy.everyonecodes.java.week3.examples.exercise1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeprechaunGoldPot1Test {
    LeprechaunGoldPot1 leprechaunGoldPot1 = new LeprechaunGoldPot1();

    @Test
    void getGoldPieces(){
        int expected = 5;
        int result = leprechaunGoldPot1.getGoldPieces();

        Assertions.assertEquals(expected, result);
    }
}
