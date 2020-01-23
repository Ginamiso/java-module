package academy.everyonecodes.java.week5.set2.exercise5;

import academy.everyonecodes.java.week5.set2.exercise4.HappinessRecord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class GotDataReaderTest {
    GotDataReader gotDataReader = new GotDataReader();

    @Test
    void read() {
        List<Character> result = gotDataReader.read();
        if (result.size() > 0) {
            Character oResult = result.get(0);
            Character expected = new Character("Addam Marbrand ", Optional.of(1), 1);
            Assertions.assertEquals(expected.getName(), oResult.getName());
            Assertions.assertEquals(expected.getBookOfDeath(), oResult.getBookOfDeath());
            Assertions.assertEquals(expected.getGender(), oResult.getGender());

        }
    }
}

