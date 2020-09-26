package academy.everyonecodes.java.week4.examples.exercise2;

public class FileNameValidator {
    public boolean validate(String file){
        return file.startsWith("PHOTO_") && file.endsWith(".png");
    }
}
