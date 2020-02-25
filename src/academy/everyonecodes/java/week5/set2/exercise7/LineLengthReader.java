package academy.everyonecodes.java.week5.set2.exercise7;

import academy.everyonecodes.java.evaluation1.importedClasses.FileReader;

import java.util.ArrayList;
import java.util.List;

public class LineLengthReader {
    public List<Integer> read(){
        String path = "src/academy/everyonecodes/java/week5/set2/files/strings.txt";
        FileReader fileReader = new FileReader();
        List<String> list = fileReader.read(path);
        List<Integer> listOfInteger = new ArrayList<>();
        for(String string : list){
            int length = string.length();
            listOfInteger.add(length);
        }
        return listOfInteger;
    }
}
