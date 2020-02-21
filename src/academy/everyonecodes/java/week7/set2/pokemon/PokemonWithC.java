package academy.everyonecodes.java.week7.set2.pokemon;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.stream.Collectors;

public class PokemonWithC {
    private PokemonDataReader reader = new PokemonDataReader();

    public int count(){
        List<Pokemon> pokemons = reader.read();
        List<String> nameAndSpeed = pokemons.stream()
                .filter(pokemon -> pokemon.getName().startsWith("C"))
                .map(pokemon -> "Name: "+pokemon.getName()+" Speed: "+pokemon.getSpeed())
                .collect(Collectors.toList());

        return nameAndSpeed.size();

    }
}
