package academy.everyonecodes.java.week9.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ElectricCarTest {

    ElectricCar electricCar = new ElectricCar("Tesla");

    @Test
    void describe(){
        String expected = "I am a Tesla car!";
        String result = electricCar.describe();

        Assertions.assertEquals(expected, result);
    }
}
