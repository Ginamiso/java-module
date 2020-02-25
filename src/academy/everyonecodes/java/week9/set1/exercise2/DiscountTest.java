package academy.everyonecodes.java.week9.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class DiscountTest {

    @ParameterizedTest
    @MethodSource("parameters")
    void apply(double expected, Discount discount, List<Product> input) {
        double result = discount.apply(input);

        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> parameters() {
        List<Product> wine = List.of(new Product("wine", 5));
        List<Product> vegetables = List.of(new Product("tomato", 10), new Product("wine", 5));
        List<Product> empty = List.of();
        return Stream.of(
                Arguments.of(0.25, new Discount(5, List.of("wine")), wine),
                Arguments.of(0.7000000000000001, new Discount (7, List.of("tomato")), vegetables),
                Arguments.of(0.0, new Discount(5, List.of("wine")), empty)
        );
    }
}