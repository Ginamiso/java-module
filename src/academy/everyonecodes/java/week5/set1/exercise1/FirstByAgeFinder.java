package academy.everyonecodes.java.week5.set1.exercise1;

import java.util.List;
import java.util.Optional;

public class FirstByAgeFinder {

    public Optional<Person> find(List<Person> people, int age) {
        for(Person person : people){
            if(person.getAge() == age){
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }
}
