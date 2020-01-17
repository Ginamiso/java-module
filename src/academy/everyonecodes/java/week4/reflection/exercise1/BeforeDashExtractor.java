package academy.everyonecodes.java.week4.reflection.exercise1;

public class BeforeDashExtractor {
    public String extract(String string) {
        if(!string.contains("-")){
            return "";
        }
        int position = 0;
        int length = string.length();
        String extracted = "";
        while(position <length){
            String character = string.substring(position, position +1);
            if(character.equals("-")){
                return string.substring(position, position +1);
            }position++;
        }

    }
}
