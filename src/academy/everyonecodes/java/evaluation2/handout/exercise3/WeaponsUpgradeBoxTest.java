package academy.everyonecodes.java.evaluation2.handout.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponsUpgradeBoxTest {

    @Test
    void apply() {
        Spaceship input = new Spaceship(4, 5);
        WeaponsUpgradeBox weaponsUpgradeBox = new WeaponsUpgradeBox(3);
        weaponsUpgradeBox.apply(input);
        int expected = 8;
        int result = input.getDamage();

        assertEquals(expected, result);
    }
    @Test
    void getIntensity(){
        WeaponsUpgradeBox weaponsUpgradeBox = new WeaponsUpgradeBox(4);
        int expected = 4;
        int result = weaponsUpgradeBox.getIntensity();

        assertEquals(expected, result);
    }
}