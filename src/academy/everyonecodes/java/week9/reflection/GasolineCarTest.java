package academy.everyonecodes.java.week9.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GasolineCarTest {

    GasolineCar gasolineCar = new GasolineCar("Alfa Romeo");

    @Test
    void describe(){
        String expected = "I am a Alfa Romeo car!";
        String result = gasolineCar.describe();

        Assertions.assertEquals(expected, result);
    }
}
