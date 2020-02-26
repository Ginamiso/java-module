package academy.everyonecodes.java.evaluation2.optionals.sets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ViewCounterTest {

    ViewCounter counter = new ViewCounter();

    @Test
    void addViewerIPAddress() {
        String input = "8484848";
        counter.addViewerIPAddress(input);
        int expected = 1;
        int result = counter.countUniqueViews();
        Assertions.assertEquals(expected, result);
    }
}