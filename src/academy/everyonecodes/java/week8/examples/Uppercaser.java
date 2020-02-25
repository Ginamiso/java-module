package academy.everyonecodes.java.week8.examples;

public class Uppercaser implements Modifier{
    @Override
    public void modify(Phrase phrase){
        String text = phrase.getText();
        phrase.setText(text.toUpperCase());
    }
}
