package academy.everyonecodes.java.week4.set1.exercise3;

import java.util.List;
import java.util.Random;

public class StringListFirstHalfPicker {

    public String pick(List<String> strings){
        if(strings.size() ==1){
            return strings.get(0);
        }
        Random random = new Random();
        int size = strings.size();
        int randomIndexFirstHalf = random.nextInt(size/2);
        return strings.get(randomIndexFirstHalf);
    }
}
