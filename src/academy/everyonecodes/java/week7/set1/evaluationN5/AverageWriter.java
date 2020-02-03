package academy.everyonecodes.java.week7.set1.evaluationN5;

import academy.everyonecodes.java.evaluation1.importedClasses.FileReader;
import academy.everyonecodes.java.evaluation1.importedClasses.FileWriter;
import academy.everyonecodes.java.evaluation1.importedClasses.StringToIntegersParser;


import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class AverageWriter {
    private FileReader reader = new FileReader();
    private FileWriter writer = new FileWriter();
    private StringToIntegersParser parser = new StringToIntegersParser();

    public void write(String inputPath, String outputPath) {


        List<String> lines = reader.read(inputPath);
        List<String> averageLines = lines.stream()
                .map(line -> parser.parse(line))
                .map(line -> getAverage(line))
                .map(number -> String.valueOf(number))
                .collect(Collectors.toList());

        writer.write(outputPath, averageLines);

    }

    double getAverage(List<Integer> numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.size();
        return average;
    }
}
