package academy.everyonecodes.java.week8.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddSurfaceTest {
    AddSurface addSurface = new AddSurface();

    @Test
    void apply() {
        Furniture input = new Furniture("table");
        addSurface.apply(input);
        Furniture expected = new Furniture("table");
        expected.getParts().add("surface");

        Assertions.assertEquals(expected, input);
    }
}