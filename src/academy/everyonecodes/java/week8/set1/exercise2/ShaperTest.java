package academy.everyonecodes.java.week8.set1.exercise2;

import academy.everyonecodes.java.week8.set1.exercise1.CircleShaper;
import academy.everyonecodes.java.week8.set1.exercise1.Shaper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class ShaperTest {

    @Test
    void testShapes() {
        Shaper circleShaper = new CircleShaper();
        String result = circleShaper.getShape();

        Assertions.assertEquals("Circle", result);

        Shaper squareShaper = new SquareShaper();
        String result2 = squareShaper.getShape();

        Assertions.assertEquals("Square", result2);

        Shaper triangleShaper = new TrinagleShaper();
        String result3 = triangleShaper.getShape();

        Assertions.assertEquals("Triangle", result3);

        List<Shaper> shapers = List.of(circleShaper, squareShaper, triangleShaper);
        List<String> names = shapers.stream()
                .map(Shaper::getShape)
                .collect(Collectors.toList());

        List<String> expected = List.of("Circle", "Square", "Triangle");

        Assertions.assertEquals(expected, names);
    }
}
