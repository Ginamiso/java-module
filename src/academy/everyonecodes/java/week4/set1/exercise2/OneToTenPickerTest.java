package academy.everyonecodes.java.week4.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class OneToTenPickerTest {

    OneToTenPicker oneToTenPicker = new OneToTenPicker();

    @Test
    void pickReturnsNumberFromList(){
         List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
         int result = oneToTenPicker.pick();

        Assertions.assertTrue(numbers.contains(result));
    }
}
