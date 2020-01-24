package academy.everyonecodes.java.week5.reflection.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class StringToIntegersParserTest {

    StringToIntegersParser stringToIntegersParser = new StringToIntegersParser();

    @Test
    void parse(){
        String input = "1;2;3;4";
        List<Integer> expected = List.of(1,2,3,4);
        List<Integer> result = stringToIntegersParser.parse(input);

        Assertions.assertEquals(expected, result);
    }
    @Test
    void parseNegativeNumber(){
        String input = "-1;4;0";
        List<Integer> expected = List.of(-1, 4, 0);
        List<Integer> result = stringToIntegersParser.parse(input);

        Assertions.assertEquals(expected, result);
    }
    @Test
    void parseReturnsEmptyList(){
        String input = "";
        List<Integer> expected = List.of();
        List<Integer> result = stringToIntegersParser.parse(input);

        Assertions.assertEquals(expected, result);
    }

}
