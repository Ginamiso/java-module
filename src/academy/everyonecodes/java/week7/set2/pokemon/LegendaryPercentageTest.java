package academy.everyonecodes.java.week7.set2.pokemon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LegendaryPercentageTest {

    LegendaryPercentage calculator = new LegendaryPercentage();

    @Test
    void calculate() {
        String result = calculator.calculate();
        String expected = "8%";
        assertEquals(expected, result);
    }
}