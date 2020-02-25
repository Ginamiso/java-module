package academy.everyonecodes.java.week8.examples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Spacer implements Modifier {

    @Override
    public void modify(Phrase input) {
        String text = input.getText();
        String modified = Stream.of(text.split(""))
                .map(letter -> letter+" ")
                .collect(Collectors.joining());
        input.setText(modified);
    }
}
