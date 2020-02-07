package academy.everyonecodes.java.week7.reflection.exercise1;

import java.util.List;

public class GenderRatioCalculator {

    private StudentPerformanceReader reader = new StudentPerformanceReader();

    public String calculate() {
        List<StudentPerformance> students = reader.read();
        int female = 0;
        for (StudentPerformance student : students) {
            if (student.getGender().equals("female")) {
                female = female + 1;
            }
        }
        int male = students.size() - female;
        String ratio = female + ":" + male;
        return ratio;
    }
}

