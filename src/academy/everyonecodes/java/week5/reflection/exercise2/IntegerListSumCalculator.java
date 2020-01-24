package academy.everyonecodes.java.week5.reflection.exercise2;

import java.util.List;
import java.util.Optional;

public class IntegerListSumCalculator {

    public Optional<Integer> sum(List<Integer> numbers) {
        if(numbers.isEmpty()){
            return Optional.empty();
        }
        int sum = 0;
        for(int number : numbers){
            sum = sum+number;
        }
        return Optional.of(sum);
    }
}
