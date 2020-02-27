package academy.everyonecodes.java.evaluation2.handout.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Antenna3GTest {

    Antenna3G antenna3G = new Antenna3G();

    @Test
    void getFrequency() {
        int expected = 1900;
        int result = antenna3G.getFrequency();

        assertEquals(expected, result);
    }
}