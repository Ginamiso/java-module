package academy.everyonecodes.java.optionals.enums.exercise1;

import java.util.ArrayList;
import java.util.List;

import static academy.everyonecodes.java.optionals.enums.exercise1.Size.*;

public class Shop {
    private List<TShirt> availableTShirts;

    public Shop(){
        this.availableTShirts = List.of(
        new TShirt("pink", XS, 25),
        new TShirt("blue", L, 30),
        new TShirt("black", XXL, 35),
        new TShirt("yellow", M, 29),
        new TShirt("purple", S, 40),
        new TShirt("pink", XXL, 35),
        new TShirt("rainbow", S, 44),
        new TShirt("orange", L, 20),
        new TShirt("purple", M, 27));

    }

    public List<TShirt> getAvailableTShirts() {
        return new ArrayList<>(availableTShirts);
    }
}
