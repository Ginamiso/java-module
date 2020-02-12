package academy.everyonecodes.java.week8.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AddLegTest {
    AddLeg addLeg = new AddLeg();

    @Test
    void apply() {
        Furniture input = new Furniture("table");
        addLeg.apply(input);
        Furniture expected = new Furniture("table");
        expected.getParts().add("leg");

        Assertions.assertEquals(expected, input);

    }
}