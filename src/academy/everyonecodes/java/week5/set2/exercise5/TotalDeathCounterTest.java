package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class TotalDeathCounterTest {
    TotalDeathCounter totalDeathCounter = new TotalDeathCounter();

    @Test
    void count(){
        Character characterOne = new Character("Addam Marbrand", Optional.empty(), 1);
        Character characterTwo = new Character("Arya Stark", Optional.empty(), 0);
        Character characterThree = new Character("Alan of Rosby", Optional.of(5), 1);
        List<Character> input = List.of(characterOne, characterTwo, characterThree);
        Optional<Integer> oResult = totalDeathCounter.count(input);
        int expected = 1;

        Assertions.assertTrue(oResult.isPresent());

        Assertions.assertEquals(expected, oResult.get());
    }
    @Test
    void count1(){
        Character characterOne = new Character("Addam Marbrand", Optional.of(1), 1);
        Character characterTwo = new Character("Arya Stark", Optional.empty(), 0);
        Character characterThree = new Character("Alan of Rosby", Optional.of(5), 1);
        List<Character> input = List.of(characterOne, characterTwo, characterThree);
        Optional<Integer> oResult = totalDeathCounter.count(input);
        int expected = 2;

        Assertions.assertTrue(oResult.isPresent());

        Assertions.assertEquals(expected, oResult.get());
    }
    @Test
    void count3(){

        List<Character> input = List.of();
        Optional<Integer> oResult = totalDeathCounter.count(input);

        Assertions.assertTrue(oResult.isEmpty());
    }

}
