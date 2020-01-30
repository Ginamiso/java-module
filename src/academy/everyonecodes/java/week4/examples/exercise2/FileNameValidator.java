package academy.everyonecodes.java.week4.examples.exercise2;

public class FileNameValidator {
    public boolean validate(String file){
        if(file.startsWith("PHOTO_")&& file.endsWith(".png")){
            return true;
        }
        return false;
    }
}
