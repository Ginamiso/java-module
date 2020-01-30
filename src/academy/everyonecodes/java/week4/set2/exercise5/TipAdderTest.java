package academy.everyonecodes.java.week4.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TipAdderTest {
    TipAdder tipAdder = new TipAdder();

    @ParameterizedTest
    @CsvSource({
            "24.50, 23.14",
            "3.0, 2.45",
            "5.5, 4.9",
            "105, 100",
            "10.5, 10",
            "100, 95.24",
            "0,0"
    })
    void add(double expected, double input){
        double result = tipAdder.add(input);

        Assertions.assertEquals(expected, result);
    }
}
