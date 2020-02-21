package academy.everyonecodes.java.week7.set2.pokemon;

import academy.everyonecodes.java.week7.set2.exercise4.StreamFileReader;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PokemonDataReader {

    private String contentPath = "src/academy/everyonecodes/java/week7/set2/files/pokemon.csv";
    private StreamFileReader reader = new StreamFileReader();
    private PokemonParser parser = new PokemonParser();

    public List<Pokemon> read(){
        Stream<String> lines = reader.readLines(contentPath);
        List<Pokemon> pokemonList = lines
                .skip(1)
                .map(line -> parser.parse(line))
                .collect(Collectors.toList());

        return pokemonList;
    }
}
