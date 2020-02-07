package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StudentPerformanceParserTest {
    StudentPerformanceParser parser = new StudentPerformanceParser();
    @ParameterizedTest
    @CsvSource({
            "female, bachelor's degree, 72, 72, 74,female;bachelor's degree;72;72;74",
            "male, associate's degree, 47,57,44, male;associate's degree;47;57;44"
    })
    void test(String gender, String parentalEducation, int mathScore, int readingScore, int writingScore, String input){
        StudentPerformance result = parser.parseLine(input);

        StudentPerformance expected = new StudentPerformance(gender, parentalEducation, mathScore, readingScore, writingScore);

        Assertions.assertEquals(expected, result);
    }

}


