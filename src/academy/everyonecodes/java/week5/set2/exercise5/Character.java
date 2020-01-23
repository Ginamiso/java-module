package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.Optional;

public class Character {
    private String name;
    private Optional<Integer> bookOfDeath;
    private int gender;

    public Character(String name, Optional<Integer> bookOfDeath, int gender){
        this.name = name;
        this.bookOfDeath= bookOfDeath;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public Optional<Integer> getBookOfDeath() {
        return bookOfDeath;
    }

    public int getGender() {
        return gender;
    }
}
