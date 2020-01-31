package academy.everyonecodes.java.evaluation1.exercise4;

import academy.everyonecodes.java.evaluation1.importedClasses.FileReader;
import academy.everyonecodes.java.evaluation1.importedClasses.FileWriter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileContentReverser {

    private FileReader reader = new FileReader();
    private FileWriter writer = new FileWriter();

    public void reverse(String inputPath, String outputPath){

        List<String> lines = reader.read(inputPath);
        List<String> linesCopy = new ArrayList<>(lines);
        Collections.reverse(linesCopy);
        writer.write(outputPath, linesCopy);
    }
}
