package academy.everyonecodes.java.week3.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class KilometerToMileConverterTest {

    KilometerToMileConverter kilometerToMileConverter = new KilometerToMileConverter();

    @ParameterizedTest
    @CsvSource({
            "0.62, 1",
            "0,0",
            "1.24, 2"

    })
    void convert(double expected, double input){
        double result = kilometerToMileConverter.convert(input);

        Assertions.assertEquals(expected, result);
    }

}
