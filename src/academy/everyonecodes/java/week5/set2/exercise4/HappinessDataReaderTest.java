package academy.everyonecodes.java.week5.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class HappinessDataReaderTest {

    HappinessDataReader happinessDataReader = new HappinessDataReader();
    String string = "src/academy/everyonecodes/java/week5/set2/files/world-happiness-2017.csv";

    @Test
    void read(){
        List<HappinessRecord> result = happinessDataReader.read();
        HappinessRecord first = result.get(0);
        HappinessRecord expected = new HappinessRecord("Lesotho",139,3.80800008773804);
        Assertions.assertEquals(expected, first);

    }
}
