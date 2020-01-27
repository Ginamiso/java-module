package academy.everyonecodes.java.week3.set2.examples.example2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SpecialLeprechaunGoldPotTest {

    SpecialLeprechaunGoldPot specialLeprechaunGoldPot = new SpecialLeprechaunGoldPot();

    @ParameterizedTest
    @CsvSource({
            "1000, 100, true",
            "0, 50, true",
            "0, 100, false"
    })
    void countGoldPieces(int expected, int age, boolean hasNeverArmed){
        int result = specialLeprechaunGoldPot.countGoldPieces(age, hasNeverArmed);

        Assertions.assertEquals(expected, result);
    }

}
