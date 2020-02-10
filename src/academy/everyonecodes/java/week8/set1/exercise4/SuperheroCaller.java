package academy.everyonecodes.java.week8.set1.exercise4;

import java.util.List;
import java.util.Optional;

public class SuperheroCaller {

    private Superhero batman = new Batman();
    private Superhero superman = new Superman();
    private Superhero spiderman = new Spiderman();

    private List<Superhero> heroes;

    public SuperheroCaller() {
        heroes = List.of(batman, superman, spiderman);
    }

    public Optional<Superhero> findSuperhero(String keyword){
        return heroes.stream()
                .filter(superhero -> superhero.getPrivateName().equals(keyword) || superhero.getSuperheroName().equals(keyword))
                .findFirst();


    }
}
