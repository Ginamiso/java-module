package academy.everyonecodes.java.week4.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FromZeroRounderTest {
    FromZeroRounder fromZeroRounder = new FromZeroRounder();

    @ParameterizedTest
    @CsvSource({
            "3,2.6",
            "-3,-2.6",
            "-8.0,-7.8",
            "0.0, 0.0"
    })
    void round(double expected, double input){
        double result = fromZeroRounder.round(input);

        Assertions.assertEquals(expected, result);
    }
}
