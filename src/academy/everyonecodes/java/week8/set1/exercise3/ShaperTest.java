package academy.everyonecodes.java.week8.set1.exercise3;

import academy.everyonecodes.java.week8.set1.exercise1.Shaper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ShaperTest {
    @Test
    void test() {

        RectangleShaper rectangleShaper = new RectangleShaper();

        String name = rectangleShaper.getShape();
        String color = rectangleShaper.getColor();

        Assertions.assertEquals("Rectangle", name);
        Assertions.assertEquals("Green", color);

        Colored colored = (Colored) rectangleShaper;
        String result = colored.getColor();

        Assertions.assertEquals("Green", result);

        Shaper shaper = (Shaper) rectangleShaper;
        String result2 = shaper.getShape();

        Assertions.assertEquals("Rectangle", result2);

        List<RectangleShaper> rectangleShapers = List.of(rectangleShaper);
        List<Colored> coloreds = List.of(rectangleShaper, colored);
        List<Shaper> shapes = List.of(rectangleShaper, shaper);

    }
}
