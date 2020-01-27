package academy.everyonecodes.java.week3.set2.examples.example2;

public class SpecialLeprechaunGoldPot {
    public int countGoldPieces(int age, boolean hasNeverArmed) {
        if(age == 100 && hasNeverArmed){
            return 1000;
        }
        return 0;
    }
}
