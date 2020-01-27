package academy.everyonecodes.java.week5.reflection.exercise2;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import academy.everyonecodes.java.week5.set2.exercise2.FileWriter;

import java.util.List;

public class SumWriter {

    private LinesCalculator calculator = new LinesCalculator();
    private FileReader fileReader = new FileReader();
    private FileWriter fileWriter = new FileWriter();
    private String contentRootPath = "src/academy/everyonecodes/java/week5/reflection/files/input.csv";
    private String outputFile = "src/academy/everyonecodes/java/week5/reflection/files/output.csv";

    public void write(){

        List<String> lines = fileReader.read(contentRootPath);
        List<String> sums = calculator.calculate(lines);

        fileWriter.write(outputFile, sums);

        }
    }

