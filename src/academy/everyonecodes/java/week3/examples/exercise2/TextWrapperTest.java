package academy.everyonecodes.java.week3.examples.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextWrapperTest {
    TextWrapper textWrapper = new TextWrapper();

    @Test
    void wrappLeft(){
        String input = "text";
        String expected = "([text";
        String result = textWrapper.wrappLeft(input);

        Assertions.assertEquals(expected, result);
    }
    @Test
    void wrappRight(){
        String input = "text";
        String expected = "text)]";
        String result = textWrapper.wrappRight(input);

        Assertions.assertEquals(expected, result);
    }
    @Test
    void wrappUp(){
        String input = "text";
        String expected = "([text)]";
        String result = textWrapper.wrappUp(input);

        Assertions.assertEquals(expected,result);
    }
}
