package academy.everyonecodes.java.optionals.sets.exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class PersonListDuplicateRemover {
    public List<Person> remove(List<Person> people) {
        Set<Person> listToSet = new HashSet<>(people);
        people = new ArrayList<>(listToSet);
        return people;
    }
}
