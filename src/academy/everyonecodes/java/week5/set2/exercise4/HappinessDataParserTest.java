package academy.everyonecodes.java.week5.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class HappinessDataParserTest {
    HappinessDataParser happinessDataParser = new HappinessDataParser();

    @Test
    void parse() {
        String input = "Lesotho;139;3.80800008773804;4.04434397548437;3.5716561999917;0.521021246910095;1.19009518623352;0;0.390661299228668;0.157497271895409;0.119094640016556;1.42983531951904";

        Optional<HappinessRecord> oResult = happinessDataParser.parseLine(input);

        Assertions.assertTrue(oResult.isPresent());
        HappinessRecord result = oResult.get();

        HappinessRecord expected = new HappinessRecord("Lesotho", 139, 3.80800008773804);

        Assertions.assertEquals(expected.getCountry(), result.getCountry());
        Assertions.assertEquals(expected.getRank(), result.getRank());
        Assertions.assertEquals(expected.getScore(), result.getScore());
    }

    @Test
    void parse2() {
        String input = "Ireland;15;6.97700023651123;7.04335166752338;6.91064880549908;1.53570663928986;1.55823111534119;0.80978262424469;0.573110342025757;0.42785832285881;0.29838815331459;1.77386903762817";

        Optional<HappinessRecord> oResult = happinessDataParser.parseLine(input);

        Assertions.assertTrue(oResult.isPresent());
        HappinessRecord result = oResult.get();

        HappinessRecord expected = new HappinessRecord("Ireland", 15, 6.97700023651123);

        Assertions.assertEquals(expected.getCountry(), result.getCountry());
        Assertions.assertEquals(expected.getRank(), result.getRank());
        Assertions.assertEquals(expected.getScore(), result.getScore());
    }

    @Test
    void parse3() {
        String input = "Ireland;Ciao;6.97700023651123;7.04335166752338;6.91064880549908;1.53570663928986;1.55823111534119;0.80978262424469;0.573110342025757;0.42785832285881;0.29838815331459;1.77386903762817";

        Optional<HappinessRecord> oResult = happinessDataParser.parseLine(input);

        Assertions.assertTrue(oResult.isEmpty());
    }
}