package academy.everyonecodes.java.evaluation2.optionals.enums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

class MostExpensiveDishFinderTest {

    MostExpensiveDishFinder finder = new MostExpensiveDishFinder();

    @ParameterizedTest
    @MethodSource("parameters")
    void find(List<Dish> expected, List<Dish> input){
        List<Dish> result = finder.find(input);

        Assertions.assertEquals(expected, result);
    }
    static Stream<Arguments> parameters(){
        Dish bruschetta = new Dish("bruschetta", Category.STARTER, 6.00);
        Dish suppli = new Dish("suppli", Category.STARTER, 3.00);
        Dish pasta = new Dish("pasta", Category.MAIN_DISH, 5.00);
        Dish tortellini = new Dish("tortellini", Category.MAIN_DISH, 6.00);
        Dish tiramisu = new Dish("tiramisu", Category.DESSERT, 4.5);
        Dish pannacotta = new Dish("pannacotta", Category.DESSERT, 7);

        return Stream.of(
                Arguments.of(List.of(bruschetta, tortellini, pannacotta), List.of(bruschetta, suppli, pasta,pannacotta, tortellini, tiramisu)),
                Arguments.of(List.of(), List.of()),
                Arguments.of(List.of(bruschetta, pannacotta), List.of(bruschetta, suppli, pannacotta))
        );
    }
}
