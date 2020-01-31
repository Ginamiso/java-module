package academy.everyonecodes.java.evaluation1.exercise5;

import academy.everyonecodes.java.evaluation1.importedClasses.FileReader;
import academy.everyonecodes.java.evaluation1.importedClasses.FileWriter;
import academy.everyonecodes.java.evaluation1.importedClasses.StringToIntegersParser;

import java.util.ArrayList;
import java.util.List;

public class AverageWriter {

    private FileReader reader = new FileReader();
    private FileWriter writer = new FileWriter();
    private StringToIntegersParser parser = new StringToIntegersParser();

    public void write(String inputPath, String outputPath) {

        List<String> lines = reader.read(inputPath);
        List<String> averageLines = new ArrayList<>();
        for (String line : lines) {
            List<Integer> numbers = parser.parse(line);
            double average = getAverage(numbers);
            String averageAsString = String.valueOf(average);
            averageLines.add(averageAsString);

        }
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
