package academy.everyonecodes.java.week9.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DieselCarTest {

    DieselCar dieselCar = new DieselCar("Toyota");

    @Test
    void describe(){
        String expected = "I am a Toyota car!";
        String result = dieselCar.describe();

        Assertions.assertEquals(expected, result);
    }
}
