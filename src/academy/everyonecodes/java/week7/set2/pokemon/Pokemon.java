package academy.everyonecodes.java.week7.set2.pokemon;

import java.util.Objects;
import java.util.Optional;

public class Pokemon {
    private String name;
    private String type1;
    private Optional<String> type2;
    private int total;
    private int hp;
    private int attack;
    private int defense;
    private int spAttack;
    private int spDefense;
    private int speed;
    private int generation;
    private boolean legendary;

    public Pokemon(String name, String type1, Optional<String> type2, int total, int hp, int attack, int defense, int spAttack, int spDefense, int speed, int generation, boolean legendary) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.total = total;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
        this.speed = speed;
        this.generation = generation;
        this.legendary = legendary;
    }

    public String getName() {
        return name;
    }

    public String getType1() {
        return type1;
    }

    public Optional<String> getType2() {
        return type2;
    }

    public int getTotal() {
        return total;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpAttack() {
        return spAttack;
    }

    public int getSpDefense() {
        return spDefense;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGeneration() {
        return generation;
    }

    public boolean isLegendary() {
        return legendary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return total == pokemon.total &&
                hp == pokemon.hp &&
                attack == pokemon.attack &&
                defense == pokemon.defense &&
                spAttack == pokemon.spAttack &&
                spDefense == pokemon.spDefense &&
                speed == pokemon.speed &&
                generation == pokemon.generation &&
                legendary == pokemon.legendary &&
                Objects.equals(name, pokemon.name) &&
                Objects.equals(type1, pokemon.type1) &&
                Objects.equals(type2, pokemon.type2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type1, type2, total, hp, attack, defense, spAttack, spDefense, speed, generation, legendary);
    }
}
