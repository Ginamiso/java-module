package academy.everyonecodes.java.week7.set2.pokemon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;


class PokemonDataReaderTest {

    PokemonDataReader reader = new PokemonDataReader();

    @Test
    void read() {
        List<Pokemon> result = reader.read();
        int expectedSize = 800;
        Assertions.assertEquals(expectedSize, result.size());
        Pokemon firstPokemon = result.get(0);
        Pokemon expectedFirst = new Pokemon("Bulbasaur","Grass", Optional.of("Poison"),318,45,49,49,65,65,45,1,false);
        Pokemon lastPokemon = result.get(result.size() -1);
        Pokemon expectedLast = new Pokemon("Volcanion","Fire",Optional.of("Water"),600,80,110,120,130,90,70,6,true);
        Assertions.assertEquals(expectedFirst, firstPokemon);

    }
}