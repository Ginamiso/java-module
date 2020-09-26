package academy.everyonecodes.java.week7.set1.evaluationN5;

import academy.everyonecodes.java.evaluation1.importedClasses.FileReader;
import academy.everyonecodes.java.evaluation1.importedClasses.FileWriter;
import academy.everyonecodes.java.evaluation1.importedClasses.StringToIntegersParser;

import java.util.List;
import java.util.stream.Collectors;

public class AverageWriter {
    private final FileReader reader = new FileReader();
    private final FileWriter writer = new FileWriter();
    private final StringToIntegersParser parser = new StringToIntegersParser();

    public void write(String inputPath, String outputPath) {


        List<String> lines = reader.read(inputPath);
        List<String> averageLines = lines.stream()
                .map(parser::parse)
                .map(this::getAverage)
                .map(String::valueOf)
                .collect(Collectors.toList());

        writer.write(outputPath, averageLines);

    }

    double getAverage(List<Integer> numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }
}
