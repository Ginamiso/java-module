package academy.everyonecodes.java.evaluation2.optionals.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficePersonalSpaceTest {

    OfficePersonalSpace personalSpace = new OfficePersonalSpace();

    @Test
    void add() {
        int spaceNumber = 2;
        String input = "shoes";
        personalSpace.add(spaceNumber, input);
        String result = personalSpace.get(2);
        String expected = "water shoes";

        Assertions.assertEquals(expected, result);
    }
}