package academy.everyonecodes.java.evaluation2.handout.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Antenna5GTest {

    Antenna5G antenna5G = new Antenna5G();

    @Test
    void getFrequency() {
        int expected = 4200;
        int result = antenna5G.getFrequency();

        assertEquals(expected, result);
    }
}