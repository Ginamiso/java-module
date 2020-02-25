package academy.everyonecodes.java.week9.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class TotalDiscountCalculatorTest {
    TotalDiscountCalculator calculator = new TotalDiscountCalculator();

    @ParameterizedTest
    @MethodSource("parameters")
    void calculate(double expected, List<Product> input) {
        double result = calculator.calculate(input);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> parameters() {
        List<Product> singleProduct = List.of(new Product("wine", 6.5));
        List<Product> products = List.of(new Product("chocolate", 4), new Product("cucumber", 3));
        List<Product> noDiscount = List.of(new Product("banana", 5));
        List<Product> empty = List.of();
        return Stream.of(
                Arguments.of(6.42, products),
                Arguments.of(6.175, singleProduct),
                Arguments.of(5.0, noDiscount),
                Arguments.of(0.0, empty)
        );
    }
}
