package academy.everyonecodes.java.week4.set1.exercise3;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Random;

public class StringListSecondHalfPicker {
    public String pick(List<String> strings) {
        Random random = new Random();
        int size = strings.size();
        int halfLength = size / 2;
        int randomNumber = random.nextInt(size - halfLength) + halfLength;
        String thisString = strings.get(randomNumber);
        return thisString;
    }

}
