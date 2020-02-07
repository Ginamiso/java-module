package academy.everyonecodes.java.week7.reflection.exercise1;


import java.util.List;

public class StudentPerformanceParser {
    public StudentPerformance parseLine(String line){
        List<String> list = List.of(line.split(";"));
        String gender = list.get(0);
        String parentalEducation = list.get(1);
        int mathScore = Integer.valueOf(list.get(2));
        int readingScore = Integer.valueOf(list.get(3));
        int writingScore = Integer.valueOf(list.get(4));
        StudentPerformance performance = new StudentPerformance(gender, parentalEducation, mathScore, readingScore, writingScore);

        return performance;
    }
}
