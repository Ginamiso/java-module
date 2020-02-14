package academy.everyonecodes.java.week8.reflection.exercise1;

import academy.everyonecodes.java.week8.reflection.exercise1.cutlery.Cutlery;
import academy.everyonecodes.java.week8.reflection.exercise1.cutlery.Fork;
import academy.everyonecodes.java.week8.reflection.exercise1.cutlery.Knife;
import academy.everyonecodes.java.week8.reflection.exercise1.cutlery.Spoon;

import java.util.List;
import java.util.stream.Collectors;

public class Waiter {
    private List<Cutlery> cutlery = List.of(new Spoon(), new Fork(), new Knife());

    public List<String> getCutlery(String dish){
        return cutlery.stream()
                .filter(cutlery -> cutlery.isUsedFor(dish))
                .map(cutlery -> cutlery.getName())
                .collect(Collectors.toList());
    }
}
