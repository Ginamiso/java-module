package academy.everyonecodes.java.week2.set2.examples.example1;

public class Door {
    private int dooNumber;
    private String keyphrase;

    public Door(int dooNumber, String keyphrase){
        this.dooNumber = dooNumber;
        this.keyphrase = keyphrase;
    }

    public int getDooNumber() {
        return dooNumber;
    }

    public String getKeyphrase() {
        return keyphrase;
    }
}
