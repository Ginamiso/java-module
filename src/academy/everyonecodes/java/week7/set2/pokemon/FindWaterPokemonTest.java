package academy.everyonecodes.java.week7.set2.pokemon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class FindWaterPokemonTest {
    FindWaterPokemon finder = new FindWaterPokemon();
    @Test
    void test(){
        long result = finder.count();
        long expected = 126;
        System.out.println(result);
        Assertions.assertEquals(expected, result);


    }
}
