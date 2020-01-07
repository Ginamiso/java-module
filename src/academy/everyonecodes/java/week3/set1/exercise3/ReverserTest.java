package academy.everyonecodes.java.week3.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverserTest {

    @Test
    void reverse() {
        Reverser reverser = new Reverser();
        List<Integer> input = List.of(1,2,3,4,5,6);
        List<Integer> result = reverser.reverse(input);
        List<Integer> expected = List.of(6,5,4,3,2,1);
        Assertions.assertEquals(expected, result);
    }
}