package academy.everyonecodes.java.week3.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameGeneratorTest {

    @Test
    void generateNewName() {
        NameGenerator nameGenerator = new NameGenerator();
        String input = "name.jpg";
        String result = nameGenerator.generateNewName(input);
        String expected = "name.png";
        Assertions.assertEquals(expected, result);

    }
}