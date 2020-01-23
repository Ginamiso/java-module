package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class LongestNameFinderTest {
    LongestNameFinder longestName = new LongestNameFinder();

    @Test
    void find(){
        Character characterOne = new Character("Addam Marbrand", Optional.empty(), 1);
        Character characterTwo = new Character("Arya Stark", Optional.empty(), 0);
        Character characterThree = new Character("Alan of Rosby", Optional.of(5), 1);
        List<Character> input = List.of(characterOne, characterTwo, characterThree);
        Optional<Character> oResult = longestName.find(input);
        Optional<Character> expected = Optional.of(new Character("Addam Marbrand", Optional.empty(), 1));

        Assertions.assertTrue(oResult.isPresent());

        Assertions.assertEquals(expected.get().getName(), oResult.get().getName());
    }
    @Test
    void find2(){
        Character characterOne = new Character("Riccardo Wasserman", Optional.empty(), 1);
        Character characterTwo = new Character("Arya Stark", Optional.empty(), 0);
        Character characterThree = new Character("Alan of Rosby", Optional.of(5), 1);
        List<Character> input = List.of(characterOne, characterTwo, characterThree);
        Optional<Character> oResult = longestName.find(input);
        Optional<Character> expected = Optional.of(new Character("Riccardo Wasserman", Optional.empty(), 1));

        Assertions.assertTrue(oResult.isPresent());

        Assertions.assertEquals(expected.get().getName(), oResult.get().getName());
    }
    @Test
    void find3(){

        List<Character> input = List.of();
        Optional<Character> oResult = longestName.find(input);
        Optional<Character> expected = Optional.empty();

        Assertions.assertTrue(oResult.isEmpty());

    }

}
