package academy.everyonecodes.java.week4.set1.exercise1;

public class PngChecker2 {
    public boolean check(String fileName){
        int start = fileName.length() - 4;
        int end = fileName.length();
        String png = fileName.substring(start, end);
        return png.equalsIgnoreCase(".png");
    }
}
