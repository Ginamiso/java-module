package academy.everyonecodes.java.week7.set2.pokemon;


public class FindWaterPokemon {

    private PokemonDataReader reader = new PokemonDataReader();

    public long count() {
        long type2 = reader.read().stream()
                .filter(pokemon -> pokemon.getType2().isPresent())
                .map(pokemon -> pokemon.getType2().get())
                .filter(pokemon -> pokemon.equals("Water"))
                .count();
        long type1 = reader.read().stream()
                .filter(pokemon -> pokemon.getType1().equals("Water"))
                .count();
        return type1 +type2;
    }

}