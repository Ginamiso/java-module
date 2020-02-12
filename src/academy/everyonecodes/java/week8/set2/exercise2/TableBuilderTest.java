package academy.everyonecodes.java.week8.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TableBuilderTest {
    TableBuilder builder = new TableBuilder();

    @Test
    void build() {
        Furniture table = builder.build();
        List<String> expected = List.of("leg", "leg", "leg", "leg", "surface");


        Assertions.assertEquals(expected, table.getParts());

    }
}