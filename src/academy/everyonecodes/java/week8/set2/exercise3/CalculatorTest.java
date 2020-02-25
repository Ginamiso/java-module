package academy.everyonecodes.java.week8.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @ParameterizedTest
    @MethodSource("parameters")
    void calculate(Optional<Double> oExpected, Calculation calculation) {
        Optional<Double> oResult = calculator.calculate(calculation);

        Assertions.assertEquals(oExpected, oResult);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(Optional.of(2.0), new Calculation("+", 1.0, 1.0)),
                Arguments.of(Optional.of(0.0), new Calculation("-", 1.0, 1.0)),
                Arguments.of(Optional.of(1.0), new Calculation("*", 1.0, 1.0)),
                Arguments.of(Optional.of(5.0), new Calculation("/", 10, 2)),
                Arguments.of(Optional.empty(), new Calculation("&", 1, 2))
        );
    }
}