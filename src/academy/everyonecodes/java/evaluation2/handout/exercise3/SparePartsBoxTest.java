package academy.everyonecodes.java.evaluation2.handout.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SparePartsBoxTest {

    @Test
    void apply() {
        SparePartsBox sparePartsBox = new SparePartsBox(3);
        Spaceship input = new Spaceship(4, 5);
        sparePartsBox.apply(input);
        int expected = 7;
        int result = input.getHealth();

        assertEquals(expected, result);
    }
    @Test
    void getIntensity(){
        SparePartsBox sparePartsBox = new SparePartsBox(3);
        int expected = 3;
        int result = sparePartsBox.getIntensity();

        assertEquals(expected, result);
    }
}