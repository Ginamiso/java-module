package academy.everyonecodes.java.week3.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrangerStudentsTest {

    @Test
    void getTotalTimeForFirstSeason() {
        StrangerStudents strangerStudents = new StrangerStudents();
        int input = 9;
        int result = strangerStudents.getTotalTimeForFirstSeason(input);
        int expected = 378;
        Assertions.assertEquals(expected, result);

    }
}