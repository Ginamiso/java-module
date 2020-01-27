package academy.everyonecodes.java.week4.reflection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import java.util.List;

public class MaxOrMinPicker {

    public int pick(List<Integer> numbers) {
        Random random = new Random();
        if (numbers.isEmpty()) {
            return random.nextInt();
        }
        ArrayList<Integer> copy = new ArrayList(numbers);
        Collections.sort(copy);
        List<Integer> newList = new ArrayList<>();
        int size = numbers.size();
        int lowestValue = copy.get(0);
        int highestValue = copy.get(size - 1);
        newList.add(lowestValue);
        newList.add(highestValue);
        int randomIndex = random.nextInt(2);
        int randomNumber = newList.get(randomIndex);
        return randomNumber;
    }
}

