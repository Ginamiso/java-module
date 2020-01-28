package academy.everyonecodes.java.week6.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class IntegerLeftShifterTest {
    IntegerLeftShifter integerLeftShifter = new IntegerLeftShifter();

    @Test
    void shiftOne(){
        List<Integer> numbers = List.of(1,2,3,4,5);
        List<Integer> shiftedNumbers = List.of(2,3,4,5,1);

        List<Integer> result = integerLeftShifter.shiftOne(numbers);

        Assertions.assertEquals(shiftedNumbers, result);
    }
    @Test
    void shiftOneEmptyList(){
        List<Integer> numbers = List.of();
        List<Integer> shiftedNumbers = List.of();

        List<Integer> result = integerLeftShifter.shiftOne(numbers);

        Assertions.assertEquals(shiftedNumbers, result);
    }
}
