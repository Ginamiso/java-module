package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Top5ParentalEducationFinderTest {
    Top5ParentalEducationFinder finder = new Top5ParentalEducationFinder();

    @Test
    void testTop5(){
        List<String> result = finder.find();
        List<String> expected = List.of("associate's degree","some college", "bachelor's degree", "some college", "some college");

        Assertions.assertEquals(expected, result);
    }
}
