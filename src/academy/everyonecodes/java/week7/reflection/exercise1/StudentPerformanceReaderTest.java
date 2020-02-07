package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class StudentPerformanceReaderTest {
    StudentPerformanceReader reader = new StudentPerformanceReader();
    @Test
    void testReader(){
        List<StudentPerformance> result = reader.read();

        int expectedSize = 1000;
        Assertions.assertEquals(expectedSize,result.size());

        StudentPerformance expectedFirst = new StudentPerformance("female","bachelor's degree",72,72,74);
        StudentPerformance resultFirst = result.get(0);

        Assertions.assertEquals(expectedFirst, resultFirst);
    }
}
