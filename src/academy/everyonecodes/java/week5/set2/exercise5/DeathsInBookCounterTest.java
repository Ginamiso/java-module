package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class DeathsInBookCounterTest {
    DeathsInBookCounter deathsInBook = new DeathsInBookCounter();

    @Test
    void count(){
        Character characterOne = new Character("Addam Marbrand", Optional.of(5), 1);
        Character characterTwo = new Character("Arya Stark", Optional.of(3), 0);
        Character characterThree = new Character("Alan of Rosby", Optional.of(5), 1);
        List<Character> input = List.of(characterOne, characterTwo, characterThree);
        int book = 5;
        Optional<Integer> oResult = deathsInBook.count(input, book);
        int expected = 2;
        Assertions.assertTrue(oResult.isPresent());

        Assertions.assertEquals(expected, oResult.get());

    }
    @Test
    void count2(){
        Character characterOne = new Character("Addam Marbrand", Optional.of(3), 1);
        Character characterTwo = new Character("Arya Stark", Optional.of(3), 0);
        Character characterThree = new Character("Alan of Rosby", Optional.of(3), 1);
        List<Character> input = List.of(characterOne, characterTwo, characterThree);
        int book = 5;
        Optional<Integer> oResult = deathsInBook.count(input, book);
        int expected = 0;
        Assertions.assertTrue(oResult.isPresent());

        Assertions.assertEquals(expected, oResult.get());

    }
    @Test
    void count3(){
        List<Character> input = List.of();
        int book = 5;
        Optional<Integer> oResult = deathsInBook.count(input, book);

        Assertions.assertTrue(oResult.isEmpty());


    }




}
