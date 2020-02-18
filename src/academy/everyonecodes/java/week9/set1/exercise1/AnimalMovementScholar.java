package academy.everyonecodes.java.week9.set1.exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class AnimalMovementScholar {
    private List<Animal> animals = Animals.get();

    public String elaborate(String keyword) {
        String oneAnimalMovements = getOneAnimalMovements(keyword);
        if (oneAnimalMovements.isEmpty())
            return getKindMovements(keyword);
        return oneAnimalMovements;
    }

    private String getKindMovements(String keyword) {
        return animals.stream()
                .filter(animal -> animal.getKind().equals(keyword))
                .flatMap(animal -> animal.getMovement().stream())
                .sorted()
                .distinct()
                .collect(Collectors.joining(","));
    }

    private String getOneAnimalMovements(String keyword) {
        return animals.stream()
                .filter(animal -> animal.getName().equals(keyword))
                .flatMap((animal -> animal.getMovement().stream()))
                .collect(Collectors.joining(","));
    }
}
