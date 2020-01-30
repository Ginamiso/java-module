package academy.everyonecodes.java.week4.examples.exercise2;



import java.util.Random;

import java.util.List;

public class RandomFileNamePicker {
    public String pick(List<String> fileNames) {
        Random random = new Random();
        int size = fileNames.size();
        int randomPosition = random.nextInt(size);
        String randomFileName = fileNames.get(randomPosition);
        return randomFileName;
    }
}
