package academy.everyonecodes.java.week9.set1.exercise1;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AnimalKindScholar {
    private List<Animal> animals = Animals.get();

    public Optional<String> elaborate(String keyword) {
       return animals.stream()
                .filter(animal -> animal.getName().equals(keyword) || animal.getKind().equals(keyword))
                .map(animal -> {
                    if (animal.getName().equals(keyword)) {
                        return animal.getKind();
                    } else {
                        return animal.getName();
                    }})
                .sorted()
                .collect(Collectors.joining(","))
               .lines().findFirst();
    }
}




