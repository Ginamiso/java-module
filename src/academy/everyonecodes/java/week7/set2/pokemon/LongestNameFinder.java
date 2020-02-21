package academy.everyonecodes.java.week7.set2.pokemon;

import java.util.Comparator;

import java.util.Optional;


public class LongestNameFinder {
    private PokemonDataReader reader = new PokemonDataReader();
    public Optional<String> find(){
       return reader.read().stream()
                .map(pokemon -> pokemon.getName())
                .sorted(Comparator.comparing(String::length).reversed())
                .findFirst();
    }
}
