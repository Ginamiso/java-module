package academy.everyonecodes.java.week8.set1.exercise1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleShaperTest {


    String expected = "Circle";

    @Test
    void getShape(){
        CircleShaper circleShaper = new CircleShaper();
        String result = circleShaper.getShape();

        Assertions.assertEquals(expected, result);

        Shaper shaper = circleShaper;
        String result2 = shaper.getShape();

        assertEquals(expected, result2);

        Shaper anotherShaper = new CircleShaper();
        String result3 = anotherShaper.getShape();

        Assertions.assertEquals(expected, result3);

    }


}