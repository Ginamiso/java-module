package academy.everyonecodes.java.week4.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

class StringAsIntegerListParserTest {
    StringAsIntegerListParser stringAsIntegerListParser = new StringAsIntegerListParser();

    @Test
    void parse(){
        String input = "1;2;3";
        List<Integer> expected = List.of(1,2,3);
        List<Integer> result = stringAsIntegerListParser.parse(input);
        Assertions.assertEquals(expected, result);
    }
    @Test
    void parse2(){
        String input = "";
        List<Integer> expected = List.of();
        List<Integer> result = stringAsIntegerListParser.parse(input);
        Assertions.assertEquals(expected, result);
    }
    @Test
    void parse3(){
        String input = "-1;-10;0";
        List<Integer> expected = List.of(-1,-10,0);
        List<Integer> result = stringAsIntegerListParser.parse(input);
        Assertions.assertEquals(expected, result);
    }

}
