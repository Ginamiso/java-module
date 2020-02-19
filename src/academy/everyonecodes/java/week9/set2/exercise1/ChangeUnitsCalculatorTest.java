package academy.everyonecodes.java.week9.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class ChangeUnitsCalculatorTest {
    ChangeUnitsCalculator calculator = new ChangeUnitsCalculator();

    @ParameterizedTest
    @MethodSource("parameters")
    void calculate(List<MoneyUnit> expected, double input) {
        List<MoneyUnit> result = calculator.calculate(input);

        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of(new Euro200(), new Euro100(), new Euro50(), new Cent50()), 350.50),
                Arguments.of(List.of(new Euro50(), new Euro2()), 52.0),
                Arguments.of(List.of(new Cent20(), new Cent20()), 0.4),
                Arguments.of(List.of(new Cent50(), new Cent5(), new Cent1()), 0.56)
        );
    }
}