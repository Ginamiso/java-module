package academy.everyonecodes.java.week8.examples;

import java.util.List;

public class PhraseModifier {
    List<Modifier> modifiers = List.of(new Uppercaser(), new Spacer());
    public void modify(Phrase phrase){
        modifiers.stream()
                .forEach(modifier -> modifier.modify(phrase));
    }
}
