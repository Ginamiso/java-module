package academy.everyonecodes.java.evaluation1.exercise2;

public class PictureNameExtractor {
    public String extract(String fileName) {

        int length = fileName.length();
        String noBeginningNoEnd = fileName.substring(8, length -7);
        String lowerCase = noBeginningNoEnd.toLowerCase();
        String finalString = lowerCase.replaceAll("-", " ");
        return finalString;

    }
}
