package academy.everyonecodes.java.christmas.exercise9;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        PhotoDirectory photoDirectory = new PhotoDirectory();
        List<String> files = photoDirectory.getAllPhotoFileNames();
        NameGenerator nameGenerator = new NameGenerator();
        FileRenamer fileRenamer = new FileRenamer();
        for(String file : files){
            String newName= nameGenerator.generateNewName(file);
            fileRenamer.renameFile(file, newName);
        }

    }
}
