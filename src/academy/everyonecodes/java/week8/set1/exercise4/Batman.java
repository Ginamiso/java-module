package academy.everyonecodes.java.week8.set1.exercise4;

import java.util.Objects;

public class Batman implements Superhero {

    private String privateName;
    private String superheroName;

    public Batman() {
        this.privateName = "Alan";
        this.superheroName = "Batman";
    }

    @Override
    public String getPrivateName() {
        return "Alan";
    }

    @Override
    public String getSuperheroName() {
        return "Batman";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Batman batman = (Batman) o;
        return Objects.equals(privateName, batman.privateName) &&
                Objects.equals(superheroName, batman.superheroName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privateName, superheroName);
    }
}

