package academy.everyonecodes.java.week5.set2.exercise7;

import academy.everyonecodes.java.week5.importedClasses.FileWriter;

import java.util.List;

public class LineLengthWriter {
    public void write(){
        String path = "src/academy/everyonecodes/java/week5/set2/files/stringlengths.txt";
        LineLengthReader lineLengthReader = new LineLengthReader();
        List<Integer> list = lineLengthReader.read();
        IntegerListToStringListConverter converter = new IntegerListToStringListConverter();
        List<String> lines = converter.convert(list);
        FileWriter writer = new FileWriter();
        writer.write(path, lines);



    }
}
