package academy.everyonecodes.java.week7.set2.pokemon;

import java.util.List;
import java.util.Optional;

public class PokemonParser {
    public Pokemon parse(String line) {
        List<String> parsedLine = List.of(line.split(","));
        String name = parsedLine.get(1);
        String type1 = parsedLine.get(2);
        Optional<String> type2;
        if(parsedLine.get(3).length()<1){
            type2 = Optional.empty();
        }else{
            type2=Optional.of(parsedLine.get(3));
        }

        int total = Integer.valueOf(parsedLine.get(4));
        int hp = Integer.valueOf(parsedLine.get(5));
        int attack = Integer.valueOf(parsedLine.get(6));
        int defense = Integer.valueOf(parsedLine.get(7));
        int spAttack = Integer.valueOf(parsedLine.get(8));
        int spDefense = Integer.valueOf(parsedLine.get(9));
        int speed = Integer.valueOf(parsedLine.get(10));
        int generation = Integer.valueOf(parsedLine.get(11));
        boolean legendary = Boolean.valueOf(parsedLine.get(12));

        Pokemon pokemon = new Pokemon(name, type1, type2, total, hp, attack, defense, spAttack, spDefense, speed, generation, legendary);
        return pokemon;
    }

}
