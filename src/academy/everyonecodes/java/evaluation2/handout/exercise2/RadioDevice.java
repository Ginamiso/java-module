package academy.everyonecodes.java.evaluation2.handout.exercise2;

import java.util.List;
import java.util.Optional;

public class RadioDevice {

    private List<RadioAntenna> antennas = List.of(new Antenna5G(), new Antenna3G());

    public Optional<String> receive(RadioMessage message){
        return antennas.stream()
                .filter(radioAntenna -> radioAntenna.getFrequency()==message.getFrequency())
                .map(text -> message.getContent())
                .findFirst();
    }
}
