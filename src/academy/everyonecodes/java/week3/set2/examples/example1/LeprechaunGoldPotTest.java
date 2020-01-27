package academy.everyonecodes.java.week3.set2.examples.example1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LeprechaunGoldPotTest {

    LeprechaunGoldPot leprechaunGoldPot = new LeprechaunGoldPot();

    @ParameterizedTest
    @CsvSource({
            "100, 10",
            "1, 99",
            "100, 9"
    })
    void countGoldPieces(int expected, int input){
        int result = leprechaunGoldPot.countGoldPieces(input);

        Assertions.assertEquals(expected, result);


    }

}
