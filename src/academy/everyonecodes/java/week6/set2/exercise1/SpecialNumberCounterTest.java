package academy.everyonecodes.java.week6.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SpecialNumberCounterTest {
    SpecialNumberCounter specialNumberCounter = new SpecialNumberCounter();

    @ParameterizedTest
    @CsvSource({
            "0, 2",
            "1, 1345",
            "3, 369",
            "0, 1111",
            "6, 666666",
            "2, 93",
    })
    void count(int expected, int input){
        int result = specialNumberCounter.count(input);

        Assertions.assertEquals(expected, result);

    }
}
