package academy.everyonecodes.java.week3.examples.exercise2;

public class TextWrapper {
    String wrappLeft(String text) {
        return "(["+text;
    }

    String wrappRight(String text) {
        return text+")]";
    }
    public String wrappUp(String text){
        text = wrappLeft(text);
        text = wrappRight(text);
        return text;
    }
}
