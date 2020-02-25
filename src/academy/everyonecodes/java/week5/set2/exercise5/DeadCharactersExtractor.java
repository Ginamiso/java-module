package academy.everyonecodes.java.week5.set2.exercise5;

import academy.everyonecodes.java.evaluation1.importedClasses.FileWriter;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DeadCharactersExtractor {
    public void extract(){
        String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/deaths.txt";
        Path path = Path.of(contentRootPath);
        FileWriter writer = new FileWriter();
        GotDataReader gotDataReader = new GotDataReader();
        List<Character> characters = gotDataReader.read();
        List <String> list = new ArrayList<>();
        for(Character character : characters){
            if(character.getBookOfDeath().isPresent()){
                String name = character.getName();
                list.add(name);
            }
        }
        writer.write(contentRootPath, list);
    }
}
