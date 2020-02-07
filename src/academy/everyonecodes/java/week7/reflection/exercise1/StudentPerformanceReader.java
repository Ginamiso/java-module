package academy.everyonecodes.java.week7.reflection.exercise1;

import academy.everyonecodes.java.week7.set2.exercise4.StreamFileReader;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StudentPerformanceReader {
    private String contentRootPath ="src/academy/everyonecodes/java/week7/reflection/files/students-performance .csv";
    private StudentPerformanceParser parser = new StudentPerformanceParser();
    private StreamFileReader streamFileReader = new StreamFileReader();

    public List<StudentPerformance> read(){
        return streamFileReader.readLines(contentRootPath)
                .skip(1)
                .map(parser::parseLine)
                .collect(toList());
    }
}
